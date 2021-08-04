package Viju;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijsv\\Documents\\Selenium\\chromedriver.exe");
        
		 WebDriver driver=new ChromeDriver(); 
   
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   driver.get("https://demoqa.com/");  
   driver.manage().window().maximize();
	
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("window.scrollBy(0,250)");
   
	  WebElement formslink =driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[2]"));
	  formslink.click();
	  Thread.sleep(5);
	  driver.findElement(By.xpath("//span[.='Practice Form']")).click();
	  driver.findElement(By.id("firstName")).sendKeys("Vijeth");
	  driver.findElement(By.id("lastName")).sendKeys("SV");
	  WebElement radio1 = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
	  radio1.click();
	  driver.findElement(By.id("userNumber")).sendKeys("7022531153");	
	  js.executeScript("window.scrollBy(0,500)");
	  driver.findElement(By.id("submit")).click();
	  js.executeScript("window.scrollBy(0,400)");
	  driver.findElement(By.id("closeLargeModal")).click();
	  
	}

}
