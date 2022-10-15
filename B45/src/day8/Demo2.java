package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void goback(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Demo1.html");
		driver.findElement(By.tagName("A")).click();
		goback(driver);
		driver.findElement(By.id("A1")).click();
		goback(driver);
		driver.findElement(By.name("n1")).click();// CS
		goback(driver);
		driver.findElement(By.className("C1")).click();
		goback(driver);
		driver.findElement(By.linkText("BhanuprakashaHK")).click();//CS
		goback(driver);
		driver.findElement(By.partialLinkText("BhanuprakashaHK")).click();
		goback(driver);
		driver.findElement(By.partialLinkText("Bhanu")).click();
		goback(driver);
		driver.findElement(By.partialLinkText("prakash")).click();
		goback(driver);
		driver.findElement(By.partialLinkText("asha")).click();
		goback(driver);
		driver.findElement(By.partialLinkText("anu")).click();
		goback(driver);
		driver.findElement(By.partialLinkText("akash")).click();
		goback(driver);
		driver.findElement(By.partialLinkText("anup")).click();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}

