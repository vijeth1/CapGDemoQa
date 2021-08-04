package Viju;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario3 {
	 

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijsv\\Documents\\Selenium\\chromedriver.exe");
	        
		 WebDriver driver=new ChromeDriver(); 
   
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   driver.get("https://demoqa.com/");  
   driver.manage().window().maximize();
	
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("window.scrollBy(0,250)");
   
	  WebElement Interactionslink =driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[4]"));
	  Interactionslink.click();
	  js.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(3);
	  
	  
	  //Slider
		/*
		 * driver.findElement(By.xpath("//span[.='Slider']")).click(); WebElement slider
		 * =
		 * driver.findElement(By.xpath("//div[@class='range-slider__tooltip__arrow']"));
		 * Actions move = new Actions(driver); Action action1 =
		 * move.dragAndDropBy(slider, 30, 0).build(); action1.perform();
		 * js.executeScript("window.scrollBy(0,300)");
		 * 
		 * Thread.sleep(2);
		 */
	  
	  
	  //Menu
		/*
		 * driver.findElement(By.xpath("//span[.='Menu']")).click(); WebElement mainitem
		 * = driver.findElement(By.xpath("//a[.='Main Item 2']")); Thread.sleep(2);
		 * WebElement subitem = driver.findElement(By.xpath("(//a[.='Sub Item'])[1]"));
		 * Actions action = new Actions(driver);
		 * action.moveToElement(mainitem).perform(); Thread.sleep(2);
		 * action.moveToElement(subitem).click().perform();
		 */
	
		
	  //Auto Complete
		  driver.findElement(By.xpath("//span[.='Auto Complete']")).click();
		  Thread.sleep(2);WebElement autoOptions= driver.findElement(By.xpath("//div[@id='autoCompleteMultipleContainer']"));
			  Actions ob = new Actions(driver);
			  ob.moveToElement(autoOptions).click(autoOptions).build().perform();
			  ob.sendKeys("B").build().perform();
			

	}

}
