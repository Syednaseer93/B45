package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*Print all the selected options of the list box
 * 
 * 
 * 
 */
public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo7.html");

		WebElement listBox = driver.findElement(By.id("A3")); //Multi Select list box

		Select select=new Select(listBox);
		
		List<WebElement> allOptions = select.getAllSelectedOptions();
		
		for(WebElement option:allOptions)
			System.out.println(option.getText());
		
		driver.quit();
	}


}
