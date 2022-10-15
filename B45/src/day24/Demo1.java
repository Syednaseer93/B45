package day24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
 */
public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo9.html");
		
		driver.findElement(By.id("A1")).click();
		
		Alert alert = driver.switchTo().alert();
		
	
		
		
		String msg = alert.getText(); //get the msg present on alert popup
		System.out.println(msg);
		
		
		
		alert.accept(); // click on OK
		
		
//		alert.dismiss(); //click on cancel
	

	}


}
