package Demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleEvents 
{
	static WebDriver driver; 
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manigandang\\Desktop\\Sample\\SeleniumDemo\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		driver.get("https://www.toolsqa.com/selenium-webdriver/keyboard-events/");
		
		String s1 = driver.getWindowHandle();
		System.out.println(s1);
		Actions action = new Actions(driver);
		WebElement w1 = driver.findElement(By.xpath("(//span[text()='DEMO SITES'])[1]"));
		WebElement w2 = driver.findElement(By.xpath("(//span[text()='Basic Demo Site'])[1]"));
		action.moveToElement(w1).moveToElement(w2).click().build().perform();

		 Set<String> windows = driver.getWindowHandles();
		 for(String obj : windows) 
		 { 
		 driver.switchTo().window(obj);
		 }
		 String s2 = driver.getWindowHandle();
		 System.out.println(s2);
		 // JavascriptExecutor
		 JavascriptExecutor js = (JavascriptExecutor)driver; 
		 js.executeScript("window.scrollBy(0,500)");
		 WebElement element = driver.findElement(By.xpath("//a[text()='Keyboard Events Sample Form']"));
		 js.executeScript("arguments[0].click();",element);
		 js.executeScript("document.getElementById('userName').value='Mr.Jones';");
		 js.executeScript("document.getElementById('currentAddress').value='Chennai';");
		 js.executeScript("document.getElementById('permanentAddress').value='Chennai';");
		 js.executeScript("window.scrollBy(0,300)");
		 js.executeScript("document.getElementById('submit').click();");
		// js.executeScript("alert.('Thanks for submitting the information');");
		//facing issue in alert handling using javascript executer 
		 Alert al = driver.switchTo().alert();
		    al.accept();
		    driver.close();
	}

}
