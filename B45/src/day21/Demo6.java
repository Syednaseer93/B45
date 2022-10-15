package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actimind.com/");
		WebElement listBox = driver.findElement(By.xpath("//a[contains(.,'AREAS OF EXPERTISE')]"));		
		Select select=new Select(listBox);
		//UnexpectedTagNameException

	}


}
