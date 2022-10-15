package day25;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo6 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		String month="July 2022";   //"April 2023";
				
		String d="27";
		
		WebDriver driver=new ChromeDriver();

		driver.manage().deleteAllCookies();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.get("https://www.makemytrip.com/");

		
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='departure']/..")).click();
		
		
		String xp="//div[text()='"+month+"']";

		for(int i=1;i<=11;i++)
		{
			System.out.println(i);
			try
			{
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xp)));
				System.out.println("Month found");
				break;
			}
			catch (Exception e) {
				System.out.println("Month Not found");
				String xp2="//span[@ aria-label='Next Month']";
				driver.findElement(By.xpath(xp2)).click();
			}
		}

		String xp3="//div[text()='"+month+"']/../..//p[.='"+d+"']";	
		driver.findElement(By.xpath(xp3)).click();
	}


}
