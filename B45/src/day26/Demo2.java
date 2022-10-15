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
 */

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
//print window handle of all the browser
		WebDriver driver=new ChromeDriver();
		
		System.out.println(driver);//address of the java object
		
		
		String wh = driver.getWindowHandle();
		
		
		System.out.println(wh);//address of the GUI object (browser)
		
		
		driver.get("file:///F:/B45/Demo9.html");
		
		driver.findElement(By.id("A5")).click();
		
		Thread.sleep(1000);
		
		Set<String> allWHS = driver.getWindowHandles();
		
		System.out.println(allWHS.size());
		
		for(String w:allWHS)
		{
			System.out.println(w);
		}
		
		
		driver.quit();
		
	}


}
