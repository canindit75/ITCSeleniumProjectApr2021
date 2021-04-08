package com.itc.calc.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.itc.calc.pages.BMIPage;
import com.itc.calc.pages.CaloriePage;
import com.itc.calc.pages.CaloriePage1;
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
		 //we need to create a constructor with argument driver 
		 CaloriePage cp = new CaloriePage(driver);
		 cp.EnterCalorieDetails("45", "f");
		 
		 CaloriePage1 cp1 = new CaloriePage1(driver);
		 cp1 = PageFactory.initElements(driver, CaloriePage1.class);
		 //If Page class is not initialized - it throws NullPointerException
		 cp1.EnterCalorieDetails("56", "m");
		 BMIPage bmi = cp1.BMILinkClick();
		 bmi = PageFactory.initElements(driver, BMIPage.class);
		 bmi.ageTextbox.sendKeys("78");
	}
}
