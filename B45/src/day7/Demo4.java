package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver browser=new ChromeDriver();
		browser.get("file:///F:/B45/Demo1.html");
		
		browser.findElement(By.tagName("a")).click();
		//in the browser find the element by tag name 'a' and click it

	}

}
