package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
/*How to perform action on the disabled element
 * Ex: if we use sendKeys we get ElementNotInteractableException
 * 
 * using JSE we can perform action on disabled element
 */
public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Day14%2016-06-2022/Element.html");
		
		Thread.sleep(1000);
		driver.findElement(By.id("A1")).clear();
		driver.findElement(By.id("A1")).sendKeys("Ravi");
		
		Thread.sleep(1000);

		String js="document.getElementById('A4').value='Ravi'";
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript(js);
		
	}

}
