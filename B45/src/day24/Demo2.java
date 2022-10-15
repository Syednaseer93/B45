package day24;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/*Alert Popup
 * 1. it is also called as JS popup
 * 2. popup will be displayed below the address bar and at the middle
 * 3. we cant inspect this popup
 * 4. we cant move the popup
 * 5. it will have OK and cancel button
 * 
 *How do u handle JS popup?
 * -> using switchTo().alert()
 * 
 * getText() //get the msg present on alert popup
 * accept() // click on OK
 * dismiss() /click on cancel
 * 
 * Note: If popup is not present at any step we get NoAlertPresentException
 * 
 * How do u verify whether alert pop up is displayed or not?
 * using explicit wait
 */
public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo9.html");
		
		driver.findElement(By.id("A1")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		try
		{
			wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Pass: Alert popup is present");
		}
		catch (Exception e) 
		{
//			e.printStackTrace();
			System.out.println("Fail: Alert popup is not present");
		}
		
		driver.quit();

	}


}
