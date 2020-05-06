package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent 
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
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manigandang\\Desktop\\Sample\\SeleniumDemo\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		driver.get("https://demoqa.com/keyboard-events-sample-form/");
		sendkey("//input[@id='userName']","Mr.Jones");
		sendkey("//textarea[@id='currentAddress']","1205 OAK STREET, OLD FORGE,NEW YORK,11240");
		
		Actions action = new Actions(driver);
	    WebElement w1= 	driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	    WebElement w2= 	driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
	   // action.moveToElement(w2).sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
	    action.sendKeys(w1,Keys.chord(Keys.CONTROL,"a")).perform();
	    action.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
	    action.sendKeys(w2,Keys.chord(Keys.CONTROL,"v")).perform();
	    click("//input[@id='submit']");
	    System.out.println("Submit Successfully");
	    
	    Alert al = driver.switchTo().alert();
	    al.accept();
	    System.out.println("Alert Handled");
	    driver.close();
	    
	   
	   
	   
	   
	   
	    
	   
	   
	   
	}

}
