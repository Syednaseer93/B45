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

public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("MMMMMMMMM yyyy");  
	    String my= formatter.format(date);  
	    System.out.println(my);  
	    
	    
	    formatter = new SimpleDateFormat("d");  
	    String d= formatter.format(date);  
	    System.out.println(d);
	    
		
		
		WebDriver driver=new ChromeDriver();

		driver.manage().deleteAllCookies();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");

		
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='departure']/..")).click();
		
		
		String xp="//div[text()='"+my+"']/../..//p[.='"+d+"']";
		
		System.out.println(xp);
		
		driver.findElement(By.xpath(xp)).click();
	}


}
