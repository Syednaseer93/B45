package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*can we handle NSEE using explicit wait?
 * can we handle findElement using explicit wait?
 * Yes
 * 
 * there is a findElement after WebDriverwait 10S, the script also has ITO 10S,
 * which one it uses? and how long max it waits ?
 * -> if there is no try -catch then only ETO is used and we get TOE
 * --> if there is Try-Catch then 10Sec of ETO is used and 10Sec of ITO is also used
 * ( We get NSEE)
 */


public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		}catch (Exception e) {
				System.out.println(e.getMessage());
		}
		
		try {
		driver.findElement(By.id("logoutLink")).click();
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		driver.quit();
	}

}







