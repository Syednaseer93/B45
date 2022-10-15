package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Handling multiple elements
 * 
 * 
 * 
 */

public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Demo4.html");
//		WebElement e = driver.findElement(By.tagName("abcd"));
//		e.sendKeys("Bhanu");
		
		List<WebElement> allTB = driver.findElements(By.tagName("abcd"));//empty list
		int count=allTB.size();
		System.out.println(count);//0
		
		driver.quit();
	}

}
