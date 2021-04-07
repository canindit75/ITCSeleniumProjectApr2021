package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChangeDropDownValues {

	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.calculator.net/calorie-calculator.html");
		 driver.manage().window().maximize();
		 //identify dropdown activity
		 WebElement activitydd = driver.findElement(By.id("cactivity"));
		 //to change dropdown values - we need to create an instance Select class
		 //and pass the dropdown element as an argument
		 //this is required - select object instance will expose the methods to 
		 //change by index, value or visible text
		 Select dd = new Select(activitydd);
		 //identify what is the cureent select value in the dropdown
		 System.out.println("Default Select value of the dropdown = " + dd.getFirstSelectedOption().getText());
		 dd.selectByIndex(0); //Basal Metabolic Rate
		 Thread.sleep(2000);
		 System.out.println("Changed value by index = 0 - Basal of the dropdown = " + dd.getFirstSelectedOption().getText());
		 dd.selectByValue("1.725");
		 Thread.sleep(2000);
		 System.out.println("Changed selection by value=1.725 - Very Active of the dropdown = " + dd.getFirstSelectedOption().getText());
		 dd.selectByVisibleText("Extra Active: very intense exercise daily, or physical job");
		 Thread.sleep(2000);
		 System.out.println("Changed Selection value by Visible Text - Extra Active of the dropdown = " + dd.getFirstSelectedOption().getText());
		 System.out.println("Is dropdown Multiselect ? = " +dd.isMultiple());
		 //note - if a dropdown is multiselect - then we can use 
		 //dd.deselectAll();
		 //dd.deselectByIndex(arg0);
		 //dd.deselectByValue(arg0);
		 //dd.deselectByVisibleText(arg0);
	}

}
