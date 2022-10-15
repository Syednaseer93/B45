package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*What is POM?
 * POM (Page Object Model) is one of the java design pattern used in selenium to
 * develop automation script in well organized manner and to handle StaleElementRefereceException
 * 
 * in POM we declare element using @FindBy, initialize it using PageFactory
 * and utilize it using getters and setters method
 * 
 * 
 * How do u handle multiple elements using POM
 * - using @FindBy only but element is declared as List<WebElement>
 * 
 * limitations of POM - Tomorrow
 */
class GooglePage{
	
	@FindBy(name="q")
	private WebElement searchBox;
	
	@FindBy(xpath = "//span[contains(.,'selenium')]")
	private List<WebElement> autoSE;
	
	GooglePage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void searchInput(String input) {
		searchBox.sendKeys(input);
	}
	
	
	public void printAutoSuggestions() {
		
		for(WebElement element:autoSE) {
			System.out.println(element.getText());
		}
	}
}

public class Demo5 {//Test Class
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		GooglePage g=new GooglePage(driver);
		
		g.searchInput("java");
		
		Thread.sleep(1000);
		
		g.printAutoSuggestions();
		driver.quit();
		
	}
}











