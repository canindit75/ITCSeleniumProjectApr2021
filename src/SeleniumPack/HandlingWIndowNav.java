package SeleniumPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWIndowNav {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 String ParentWindowID = driver.getWindowHandle();
		 System.out.println("Parent Window ID = " + ParentWindowID);
		 //Set<String> winids = driver.getWindowHandles();
		 //identify the Login Now Button
		 WebElement LoginNow = driver.findElement(By.xpath("//*[@title='LOGIN NOW']"));
		 LoginNow.click();
		 //After LoginNow is clicked - there are 2 open windows 
		 //lets get the 2 window ids
		 //Please note to get the current number of open windows - it is 
		 //necessary to call getWindowHandles everytime a click operation that opens a new window
		 Set<String> winids = driver.getWindowHandles();
		 System.out.println("Number of Open Windows = " + winids.size());
		 //for iterating through the winids
		 Iterator<String> iter = winids.iterator();
		 String MainWindowID = iter.next(); //will match with your ParentWindowID
		 String SubWindowID = iter.next();
		 System.out.println("MainWindowID = " + MainWindowID);
		 System.out.println("SubWindowID = " + SubWindowID);		
		 //switch to the sub window
		 driver.switchTo().window(SubWindowID);
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 try{
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("User_Id")));
			 driver.findElement(By.name("User_Id")).sendKeys("Selenium");	
			 Thread.sleep(3000);
			 driver.close();
			 driver.switchTo().window(MainWindowID);
			 //lets identify an element in the MainWindowID
			 driver.findElement(By.id("topMnuinsurance")).click();
		 }catch(NoSuchElementException e){
			 System.out.println("User_Id is not found");
		 }
	}
}
