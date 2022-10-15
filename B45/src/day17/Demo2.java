package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 1. Dev can insert one web page inside another web page - embeded webapge
 * 2. this is created using <iframe> or <frameset>
 * 3. if the element is inside the frame we should switch to frame before finding it
 * 4. we have following ways to switch to frame
 * 	a. using index(int)  -->driver.switchTo().frame(0);
 *  b. using name or id (String) -->driver.switchTo().frame("f1");
 *  c. using address of the frame (WebElement) -->driver.switchTo().frame(frameElement);
 *  Note: if specified index/id/element is invalid then we get NoSuchFrameException
 *  
 *  
 * 5. How do u exit from the frame?
 * 		a. driver.switchTo().defaultContent(); - come to main page
 * 		b. driver.switchTo().parentFrame(); -- come to parent (1 step back /up)
 * 
 */

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/sample1.html");
		
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("A");
		
		driver.switchTo().frame(0);// go inside 1st frame
		
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("A");
		
		driver.switchTo().defaultContent();// exit from the frame- main page
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("B");
		
		driver.switchTo().frame("f1");
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("B");
		
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("C");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("C");
	
	}

}
