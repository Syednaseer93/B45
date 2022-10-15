package day26;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

/*Open new tab and new window in selenium 3
 * 
 * 
 */
public class Demo7 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://www.google.com");
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);			//new tab
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(1000);
		
		Set<String> allWHS = driver.getWindowHandles();
		for(String wh:allWHS) {
			driver.switchTo().window(wh);
		}
		
		driver.get("http://www.gmail.com");
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_N);			//new window
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(1000);
		
		 allWHS = driver.getWindowHandles();
		for(String wh:allWHS) {
			driver.switchTo().window(wh);
		}
		
		driver.get("http://www.fb.com");
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}


}
