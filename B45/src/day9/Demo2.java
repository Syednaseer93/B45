package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * shortcut---- # represents id
a[id='a1']	<--> 
a#a1  --> tag should be 'a' and id should be 'a1'
#a1-->id should be 'a1' and tag can be anything

a[class='c1']
a.c1--> tag should be 'a' and class should be 'c1'
.c1--> class should be 'c1' and  tag can be anything

 */

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
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		goback(driver);
		driver.findElement(By.cssSelector("a#a1")).click();
		goback(driver);
		driver.findElement(By.cssSelector("#a1")).click();
		goback(driver);
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		goback(driver);
		driver.findElement(By.cssSelector("a.c1")).click();
		goback(driver);
		driver.findElement(By.cssSelector(".c1")).click();
		driver.quit();
	}

}

