package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Page Object Model    
/* in POM we declare variable using FindBy Annotation
 * 
 * @FindBy(loc="val")
 * private WebElement name;
 * 
 * in POM we initialize using initElements method of PageFactory class
 * it takes 2 arg, Browser and POM object
 * 
 * what happens if we dont use initElements?
 * --> we get NullPointerException
 * 
 * When it will get the address of the element in POM?
 * declaration  NO
 * object creation No
 * during initiElements No
 * just before the action Yes
 * (above behavior is called as lazy initialization)
 * 
 * Which exception we get if we dont use initElements in POM class
 * NullPointerException
 * 
 */
class LoginPage{
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
		
	void setUserName(String un){
		unTB.sendKeys(un);
	}
	
	void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	
	void clickLogin(){
		loginBTN.click();
	}
	
	
}

public class Demo3 {//Test Class
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l=new LoginPage();

		PageFactory.initElements(driver,l);
		
		l.setUserName("bhanu");
		l.setPassword("damager");
		l.clickLogin();
		
		
		Thread.sleep(3000);
		
		
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLogin();
		
		
	}
}











