package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
/* findElement returns WebElement
 * in WebElement we following method to get css info on the element
 *getCssValue
 */
public class Demo4 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.actitime.com/login.do");
	
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		Thread.sleep(4000);
		
		WebElement errMsg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		
		String fs = errMsg.getCssValue("font-size");
		System.out.println(fs);
		
		String ff=errMsg.getCssValue("font-family");
		System.out.println(ff);
		
		String c = errMsg.getCssValue("color");
		System.out.println(c);//rgba
		
		String hexaColorValue = Color.fromString(c).asHex();
		System.out.println(hexaColorValue);//#ce0100
		
		driver.quit();
	}

}
