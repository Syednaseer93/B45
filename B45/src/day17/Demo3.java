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

public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Demo4.html");
//		WebElement e = driver.findElement(By.tagName("input"));
//		e.sendKeys("Bhanu");
		List<WebElement> allTB = driver.findElements(By.tagName("input"));
		int count=allTB.size();
		System.out.println(count);
		
//		WebElement e = allTB.get(0);
//		e.sendKeys("Bhanu");
//		
//		WebElement e2 = allTB.get(1);
//		e2.sendKeys("Bhanu");
		
		for(int i=0;i<count;i++)
		{
			WebElement e = allTB.get(i);
			e.sendKeys("A");
		}
		
		for(WebElement tb:allTB)
		{
			tb.sendKeys("B");
		}
		
		
		WebElement e3 = allTB.get(2);
		e3.sendKeys("Bhanu");
	}

}
