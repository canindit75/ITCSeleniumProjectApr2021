package testngPack;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalorieCalculatorTestCase {
	public static WebDriver driver = null;
	@BeforeMethod
	public void LaunchBrowser(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.calculator.net/calorie-calculator.html");
		 driver.manage().window().maximize();		
	}
	@Test
	public void EnterCalorieDetails() throws InterruptedException{

		// WebElement ageTextbox = driver.findElement(By.id("cage"));
		 WebElement ageTextbox = driver.findElement(By.id("cage"));
		 ageTextbox.clear();
		 ageTextbox.sendKeys("45");
		 System.out.println("id value of ageTextbox = " +ageTextbox.getAttribute("id"));
		 System.out.println("name value of ageTextbox = " +ageTextbox.getAttribute("name"));
		 System.out.println("value of ageTextbox = " +ageTextbox.getAttribute("value"));
		 System.out.println("type value of ageTextbox = " +ageTextbox.getAttribute("type"));
		 System.out.println("class value of ageTextbox = " +ageTextbox.getAttribute("class"));
		 System.out.println("tagname of ageTextbox = " +ageTextbox.getTagName());
		 //import java.util.List package
		 //List<WebElement> genderList = driver.findElements(By.name("csex"));
		 List<WebElement> genderList = driver.findElements(By.xpath("//*[@name='csex']"));
		 //loop through the list of elements and the element which has value ="f"
		 //id to identify the element because then the idea of using name locator strategy
		 if(genderList.size()>0){
			 for(WebElement gender : genderList){
				 if(gender.getAttribute("value").equals("f")){
					 if(!gender.isSelected()){
						 gender.click();
						 break;
					 }
				 }
			 }
		 }
		 
 	}
	@Test
	public void ExtractWebTable(){
		 WebElement table = driver.findElement(By.className("cinfoT"));
		 List<WebElement> rows =  table.findElements(By.tagName("tr"));
		 for(WebElement row : rows){
			 List<WebElement> cells = row.findElements(By.tagName("td"));
			 for(WebElement cell : cells){
				 System.out.print(cell.getText() + "\t");
			 }
		  System.out.print("\n");	 
		 }

	}
	@AfterMethod
	public void CloseBrowser() throws InterruptedException{
		 Thread.sleep(3000);
		if(driver!=null)
		{
			 //driver.close(); //close the current active window
			 driver.quit(); //closes all browsers opened via script

		}
	}
}

