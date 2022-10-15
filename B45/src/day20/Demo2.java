package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		for(int i=1;i<=20;i++)
		{
				System.out.println(i);
				try 
				{
					driver.findElement(By.id("logoutLink")).click();
					System.out.println("Clicking on logout link");
					break;
				}
				catch (Exception e) 
				{
					System.out.println("Logout link not present");
				}
		}
		
		System.out.println("End");
		
	}

}
