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
 * 5. Right clicking is also called as context click
 * 6. when we right click we get list of options- Context Menu
 * 7. to Right clicking we use contextClick method of Actions class
 */
public class Demo6 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//No arg 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");		
		
		String xp="//span[.='right click me']";
		WebElement button = driver.findElement(By.xpath(xp));
		Actions actions=new Actions(driver);
		actions.contextClick(button).perform();
		
		driver.findElement(By.xpath("//span[.='Quit']")).click();
	}

}








