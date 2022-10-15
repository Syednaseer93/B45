package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Child Browser Popup / Child window popup
 * 1. we can inspect the popup
 * 2. we can move the popup
 * 3. it has max & min buttons
 */

public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		System.out.println(driver);//address of the java object
		
		
		String v = driver.getWindowHandle();
		
		
		System.out.println(v);//address of the GUI object (browser)
		
		
		driver.quit();
		
	}


}
