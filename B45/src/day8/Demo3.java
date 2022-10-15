package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//locators
/*
 * tagName
 * id
 * name
 * className
 * linkText
 * partialLinkText
 * cssSelector
 * xpath
 */
public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Demo3.html");
		
		driver.findElement(By.tagName("input")).sendKeys("bhanu");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("akshara");
		
		
		
		
		
		
		
	}

}

