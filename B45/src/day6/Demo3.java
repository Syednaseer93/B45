package day6;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//make the browser full screen
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		driver.manage().window().minimize();// selenium 4
		Thread.sleep(1000);
		driver.quit();
	}
}