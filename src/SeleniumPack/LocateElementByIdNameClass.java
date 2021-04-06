package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByIdNameClass {
	public static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.calculator.net/calorie-calculator.html");
		 driver.manage().window().maximize();
		 
		 WebElement ageTextbox = driver.findElement(By.id("cage"));
		 ageTextbox.clear();
		 ageTextbox.sendKeys("45");
		 System.out.println("id value of ageTextbox = " +ageTextbox.getAttribute("id"));
		 System.out.println("name value of ageTextbox = " +ageTextbox.getAttribute("name"));
		 System.out.println("value of ageTextbox = " +ageTextbox.getAttribute("value"));
		 System.out.println("type value of ageTextbox = " +ageTextbox.getAttribute("type"));
		 System.out.println("class value of ageTextbox = " +ageTextbox.getAttribute("class"));
		 System.out.println("tagname of ageTextbox = " +ageTextbox.getTagName());
		 

	}

}
