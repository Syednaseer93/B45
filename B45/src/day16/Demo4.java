package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
/* Is it possible for a blind person to use the computer?
 * yes
 * 
 * How do they know what is on the screen- On screen Narrator
 * 
 */
public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		
				
		String name = unTB.getAccessibleName();
		System.out.print(name+" ");
		
		
		String role = unTB.getAriaRole();
		System.out.println(role);
		
		driver.quit();
		
	}

}
