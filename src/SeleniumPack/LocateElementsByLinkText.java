package SeleniumPack;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocateElementsByLinkText {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.calculator.net/calorie-calculator.html");
		 driver.manage().window().maximize();
		 WebElement BMILink = driver.findElement(By.linkText("BMI"));
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",BMILink);

		 BMILink.click();
		 //Find the title of the Current Page
		 System.out.println("Title of BMI Page = " + driver.getTitle());
		 System.out.println("Current URL of BMI Page = " + driver.getCurrentUrl());
		 String PageSource = driver.getPageSource();
		 System.out.println("PageSource = " + PageSource);
		 //TO Go Back using History
		 driver.navigate().back();
		 System.out.println("Title of Calorie Page = " + driver.getTitle());
		 System.out.println("Current URL of Calorie Page = " + driver.getCurrentUrl());
		 //String CalPageSource = driver.getPageSource();
		 //System.out.println("Cal PageSource = " + CalPageSource);
		 //Thread.sleep(2000); //pauses 2 sec or 2000 milliseconds
		 driver.navigate().forward();
		 //System.out.println("CalPageSource = " + CalPageSource);
		 WebElement IdealWeightLink = driver.findElement(By.partialLinkText("Weight"));
		 IdealWeightLink.click();
		 WebElement ageTextbox = driver.findElement(By.id("cage"));
		 ageTextbox.clear();
		 ageTextbox.sendKeys("45");
		 System.out.println("Title of IdealWeight Page = " + driver.getTitle());
		 System.out.println("Current URL of IdealWeight Page = " + driver.getCurrentUrl());
		 //String IdealWPageSource = driver.getPageSource();
		 //System.out.println("IdealWPageSource = " + IdealWPageSource);
		 driver.navigate().refresh(); //reloads the page - reloading the page  - it gets detached from the DOM  
		 //the elements become stale and it means the elements are no longer attached to the DOM
		 //There is a difference between element not found - element is stale
		 //Resolution - to identify the element again before performing operation on stale elements
		 ageTextbox = driver.findElement(By.id("cage"));
		 ageTextbox.clear();
		 ageTextbox.sendKeys("67");
		 //Example of NoSuchSessionException
		 driver.close();
		 ageTextbox.sendKeys("67"); //At this statement - NoSuchSessionException
	}
}
