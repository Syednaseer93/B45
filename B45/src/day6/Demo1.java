package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//open the browser
		//enter the url in the address bar & wait till page is completely loaded
		driver.get("https://demo.actitime.com/login.do");
		//get page source and print it
		String html_code = driver.getPageSource();
		System.out.println(html_code);
		driver.quit();
	}
}