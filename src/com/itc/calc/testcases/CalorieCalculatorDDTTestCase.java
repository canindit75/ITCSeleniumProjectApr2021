package com.itc.calc.testcases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class CalorieCalculatorDDTTestCase {
	public static WebDriver driver = null;
	
	@BeforeClass
	public void LaunchBrowser(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.calculator.net/calorie-calculator.html");
		 driver.manage().window().maximize();		
	}
	@Test
	public void EnterCalorieDetails() throws InterruptedException{
		 WebElement ageTextbox = driver.findElement(By.id("cage"));
		 ageTextbox.clear();
		 ageTextbox.sendKeys("45");
		 List<WebElement> genderList = driver.findElements(By.xpath("//*[@name='csex']"));
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
	@AfterClass
	public void CloseBrowser() throws InterruptedException{
		 Thread.sleep(3000);
		if(driver!=null)
		{
			 //driver.close(); //close the current active window
			 driver.quit(); //closes all browsers opened via script

		}
	}
}

