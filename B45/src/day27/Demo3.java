package day27;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Demo3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		HashMap<String,Integer> p=new HashMap<String,Integer>();
		//1->allow  2->block
		p.put("profile.default_content_setting_values.notifications",2);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", p);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://pushalert.co/demo");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("send-button")).click();
		
		Thread.sleep(3000);//replace this with webdriver wait - visibilityof...
		
		String msg = driver.findElement(By.id("pa_class-blocked-info")).getText();
		
		System.out.println(msg);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
