package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
/*To view complete information of an element - in Selenium 4
 * 1. goto demo.actitime.com
 * 2. open dev tool bar (F12)
 * 3. goto console tab
 * 4. type ->  console.dir(document.getElementById('username'))
 * 
 * 5. expand >input#username.textField
 * 
 * 6. to get any of the properties listed we use getDomProperty
 * 
 * 7. to get any of the attribute we use getDomAttribute
 * 
 * 
 */
public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		
		String ph = unTB.getDomAttribute("placeholder");
		System.out.println(ph);
		
		String outer_html = unTB.getDomProperty("outerHTML");
		System.out.println(outer_html);
		
		driver.quit();
		
	}

}
