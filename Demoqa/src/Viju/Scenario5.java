package Viju;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijsv\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,60);
		String s1="//div[@class='card-body']/*[contains(text(),'Forms')]";
		WebElement element=driver.findElement(By.xpath(s1));
		wait.until(ExpectedConditions.elementToBeClickable(element));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		WebElement Interactionslink =driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[3]"));
		Interactionslink.click();


		js.executeScript("window.scrollBy(0,300)");

		WebElement ModalDialogOption=driver.findElement(By.xpath("//ul[@class='menu-list']//li[5]//span[contains(text(),'Modal')]"));
		ModalDialogOption.click();

		WebElement smallmodalButton=driver.findElement(By.xpath("//button[@id='showSmallModal']"));
		smallmodalButton.click();

		
		Thread.sleep(2000);
		WebElement closebtn=driver.findElement(By.id("closeSmallModal"));
		wait.until(ExpectedConditions.elementToBeClickable(closebtn));
		closebtn.click();


		WebElement largemodalButton=driver.findElement(By.xpath("//button[@id='showLargeModal']"));
		largemodalButton.click();
		 closebtn=driver.findElement(By.id("closeLargeModal"));
		wait.until(ExpectedConditions.elementToBeClickable(closebtn));
		closebtn.click();

	}

}
