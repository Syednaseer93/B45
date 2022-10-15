package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

class BP
{
	
	@FindAll({@FindBy(tagName ="input"),@FindBy(xpath="//a")})  //any one locator should match - OR
	private List<WebElement> allE;
	
	@FindBys({@FindBy(tagName ="input")})	//all locator should match - AND
	private List<WebElement> allE2;
	
	
	BP(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void printElement() {
		System.out.println(allE.size());
		for(WebElement e:allE) {
			System.out.println(e.getAttribute("id"));
		}
	}
	
	public void printElement2() {
		System.out.println(allE2.size());
		for(WebElement e2:allE2) {
			System.out.println(e2.getAttribute("id"));
		}
	}
}

public class Demo4 {//Test Class
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///F:/B45/Demo9.html");
		BP b=new BP(driver);
//		b.printElement();
		
		b.printElement2();
		
		driver.quit();
		
	}
}











