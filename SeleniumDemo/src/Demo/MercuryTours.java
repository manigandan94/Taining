package Demo;


import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class MercuryTours 
{
	static WebDriver driver; 
	public static void sendkey(String str1, String str2)
	{
		WebElement web = driver.findElement(By.xpath(str1));
		web.sendKeys(str2);
	}
	public static void click(String str1)
	{
		WebElement web = driver.findElement(By.xpath(str1));
		web.click();
		
	}
	public static void screenshot()
	{
		try {
		GregorianCalendar date = new GregorianCalendar();
		int second = date.get(Calendar.SECOND);
		int millisecond = date.get(Calendar.MILLISECOND);
		TakesScreenshot screen =((TakesScreenshot)driver);
		File SrcFile=screen.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\manigandang\\Desktop\\Selenium\\Screenshots\\File"+second+millisecond+".jpg");
		FileUtils.copyFile(SrcFile, path);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
public static void main(String args[]) throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manigandang\\Desktop\\Sample\\SeleniumDemo\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	driver.get("http://demo.guru99.com/test/newtours/");
	String s1 = "Welcome: Mercury Tours";
	String s2 = driver.getTitle();
	Assert.assertEquals(s1, s2);
	System.out.println("Title Validation Successfull");
	
	
	click("//a[text()='REGISTER']");
    screenshot();
	sendkey("//input[@name='firstName']" , "Mani");
	sendkey("//input[@name='lastName']" , "Ravon");
	sendkey("//input[@name='phone']" , "134567890");
	sendkey("//input[@name='userName']" , "Mani@gmail.com");
	sendkey("//input[@name='address1']" , "address");
	sendkey("//input[@name='city']" , "chennai");
	sendkey("//input[@name='state']" , "tamilnadu");
	sendkey("//input[@name='postalCode']" , "600085");
	
	Select country = new Select(driver.findElement(By.name("country")));
	country.selectByValue("INDIA");
	
	sendkey("//input[@name='email']" , "maniravon");
	sendkey("//input[@name='password']" , "12345");
	sendkey("//input[@name='confirmPassword']" , "12345");
	screenshot();
	click("//input[@name='submit']");
	String success = driver.findElement(By.xpath("(//font/b)[2]")).getText();
	screenshot();
	System.out.println(success);
	if(success.contains("maniravon"))
	{
		System.out.println("Registeration Successfull");
	}
	else
	{
		System.out.println("Registeration Falied");
	}
	driver.close(); 
	
}
}


/*output:
	Title Validation Successfull
	Note: Your user name is maniravon.
	Registeration Successfull
*/