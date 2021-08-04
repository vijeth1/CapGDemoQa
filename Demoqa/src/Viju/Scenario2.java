package Viju;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijsv\\Documents\\Selenium\\chromedriver.exe");
	        
		 WebDriver driver=new ChromeDriver(); 
   
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   driver.get("https://demoqa.com/");  
   driver.manage().window().maximize();
	
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("window.scrollBy(0,250)");
   
	  WebElement Interactionslink =driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[5]"));
	  Interactionslink.click();
	  js.executeScript("window.scrollBy(0,500)");
	  driver.findElement(By.xpath("//span[.='Selectable']")).click();
	  
	  WebElement countryUL= driver.findElement(By.xpath("//ul[@id='verticalListContainer']"));
	  List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
	  for (WebElement li : countriesList) {
	  if (li.getText().equals("Cras justo odio")) {
	       li.click();
	       Thread.sleep(3);
	       js.executeScript("window.scrollBy(0,400)");
	       Thread.sleep(3);
	       driver.findElement(By.xpath("//span[.='Dragabble']")).click();
	       
	       
	       
	       Actions act=new Actions(driver);
	       
			// find element which we need to drag
			WebElement drag=driver.findElement(By.xpath("//div[@id='dragBox']"));
			
			// calling the method and x,y cordinates are random
			act.dragAndDropBy(drag, 250, 150).build().perform();
	     }
	  }

	}

}
