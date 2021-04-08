package com.itc.calc.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.itc.calc.pages.CaloriePage;
public class CalorieCalculatorPageTestCase {
	public static WebDriver driver = null;
	@Test
	public void EnterCalorieDetails(){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.calculator.net/calorie-calculator.html");
		 driver.manage().window().maximize();	
		 //pass the driver object instance
		 //since we are passing the driver object instance the CaloriePage class 
		 //we need to creare a constructor with argument driver 
		 CaloriePage cp = new CaloriePage(driver);
		 cp.EnterCalorieDetails("45", "f");
	}
}
