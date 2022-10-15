package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void goback(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://demo.actitime.com/login.do");
		//enter user name
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		//enter password
		driver.findElement(By.cssSelector("input.textField.pwdfield")).sendKeys("manager");
		//click on login button
		driver.findElement(By.cssSelector("#loginButton")).click();
		//wait for 3 seconds so that home page is displayed
		Thread.sleep(3000);
		//verify that home page is displayed
		String expectedTitle="actiTIME - Enter Time-Track";
		System.out.println("Expected Title:"+expectedTitle);
		
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title:"+actualTitle);
		
		if(actualTitle.equals(expectedTitle))					//assert
		{
			System.out.println("Pass: Home Page is Displayed");
		}
		else
		{
			System.err.println("Fail: Home Page is NOT Displayed");
		}
		//close the browser
		driver.quit();
	}

}

