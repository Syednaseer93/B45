package day30;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*What is page object model?
 * concept - java design pattern used to develop script - handle SERE
 * 
 * What is PageFactory?
 * It is Selenium class used to initialize elements of POM class 
 * 
 * can we run POM class directly?
 * No
 * (No main method)
 * 
 * what is purpose of POM class
 * store element and actions
 * -- repository class
 * 
 * 
 */

class LoginPage
{
	@FindBy(id="username")
	private WebElement unTB;
	
	LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String un) {
		unTB.sendKeys(un);
	}
	
	
}
public class Demo1 {

	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l=new LoginPage(driver);
		l.setUserName("bhanu");
	
	}
}
