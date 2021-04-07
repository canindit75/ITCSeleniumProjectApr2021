package SeleniumPack;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOperationExample {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demo.opencart.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 //identify the Components Menu link
		 WebElement ComponentsMenuLink = driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a"));
		 ComponentsMenuLink.click();
		 //Declare Explicit Wait
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 try{
			 //element identification + propertycheck + timeout
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[3]/a")));
			 WebElement PrinterElement = driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[3]/a"));
			 //PrinterElement.click();
			 Actions actions = new Actions(driver);
			 Thread.sleep(2000);
			 actions.moveToElement(PrinterElement).click().build().perform();
		 }
		 catch(NoSuchElementException e){
			 System.out.println("Printer Element is not found");
		 }
		 

	}

}
