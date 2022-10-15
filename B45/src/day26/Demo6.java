package day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo6 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://www.google.com");
		
		
		//only in Selenium 4
		driver.switchTo().newWindow(WindowType.TAB);// 1. open new tab 2. switch to 2nd tab
		
		driver.get("http://www.gmail.com");
	
		driver.switchTo().newWindow(WindowType.WINDOW);//open new browser & switch to it
		
		driver.get("http://www.fb.com");
		
		Thread.sleep(1000);
		
		
		
		
		
		driver.quit();
		
	}


}
