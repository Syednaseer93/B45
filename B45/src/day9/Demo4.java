package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//InvalidSelectorException-- if cssSelector or xpath expression is invalid(Syntax) we get this exception

public class Demo4 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.cssSelector("input[id'username']")).sendKeys("admin");
		
	}

}

