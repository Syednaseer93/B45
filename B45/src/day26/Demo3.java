package day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Child Browser Popup / Child window popup
 * 1. we can inspect the popup
 * 2. we can move the popup
 * 3. it has max & min buttons
 * 4. Window handle- address of the browser
 * 
 * what is the diff b/w getWindowHandle & getWindowHandles
 * -> getWindowHandle - return (String) the address(window handle) of the current browser
 * 
 * -> getWindowHandles returns(Set<String>) window handle of all the browsers (parent & child)
 * 
 * what is the diff b/w close and quit
 * 
 * close closes current browser
 * quit closes all the browser - terminate the process 
 * 
 * can we close all the browser without using quit?
 * 
 * write a code to print title of all the browser
 */

public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///F:/B45/Demo9.html");
		
		driver.findElement(By.id("A5")).click();
		
		Thread.sleep(1000);
		
		Set<String> allWHS = driver.getWindowHandles();
		
		
		for(String wh:allWHS) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
			Thread.sleep(1000);
		}
		
		
//		driver.quit(); close all the browser
//		driver.close(); //closes only current browser
		
	}


}
