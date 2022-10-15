package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
				WebDriver driver=new ChromeDriver();
				//enter the url
				driver.get("https://demo.actitime.com/login.do");
				//enter user name
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
				//enter password
				driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
				//click on login button
				driver.findElement(By.xpath("//*[@id='loginButton']")).click();
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
