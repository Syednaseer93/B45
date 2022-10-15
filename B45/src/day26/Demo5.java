package day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*How do u handle tabs in selenium?
 * getWindowHandles & switchTo().window()
 * 
 * 
 */
public class Demo5 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(4000);
		
		Set<String> allWHS = driver.getWindowHandles();
		int count = allWHS.size();
		
		System.out.println(count);
		
		for(String wh:allWHS) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			driver.close();
			Thread.sleep(1000);
		}
		
//		driver.quit(); //close all the tab/browser
	}


}
