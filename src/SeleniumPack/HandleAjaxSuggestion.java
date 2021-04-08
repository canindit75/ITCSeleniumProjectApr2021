package SeleniumPack;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAjaxSuggestion {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		JavascriptExecutor js = null;
		Alert alert = null;
		String alertMesg = null;
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("s");
		WebDriverWait wait = new WebDriverWait(driver,30);
		//if i am able to check for the  presence of the first element in the list 
		//the list is visible
		try{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@role='listbox']/li[1]")));
		List<WebElement> lst = driver.findElements(By.xpath("//*[@role='listbox']/li"));
		for(WebElement element:lst){
			//System.out.println(element.getText());
			if(element.getText().equals("sbi online"))
			{
				element.click();
				break;
			}
		}
		}catch(NoSuchElementException e){
			System.out.println("List is not appearing");
		}
	}
}
