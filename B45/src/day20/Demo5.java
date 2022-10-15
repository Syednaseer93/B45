package day20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*Actions class
 * 1. in which package Actions class is present -interactions
 * 2. what is Action & Actions-Action is Interface , Actions is class
 * 3. Actions class has parameterized constructor
 * 4. When we call any method of Actions class, we should call perform()
 * 
 */
public class Demo5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	//Handling drop down menu
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//No arg 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.actimind.com/");		
		
		String xp="//a[contains(.,'AREAS OF EXPERTISE')]";
		WebElement menu = driver.findElement(By.xpath(xp));
		
		Actions actions=new Actions(driver);// param 
		actions.moveToElement(menu).perform();

		driver.findElement(By.xpath("//a[.='Web Crawling']")).click();
	}

}








