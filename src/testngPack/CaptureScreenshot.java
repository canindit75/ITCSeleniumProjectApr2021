package testngPack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	public static WebDriver driver = null;
	@Test
	public void getScreenshot() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.calculator.net/calorie-calculator.html");
		 driver.manage().window().maximize();		
		 //Just like JavascriptExecutor interface that exposes executeScript
		 //we have a method getScreenshotAs method exposed by TakesScreenshot interface
		 //when we cast driver with this interface
		 GetScreenshot(driver,"CalorieImage.png");
		 driver.findElement(By.linkText("BMI")).click();
		 Thread.sleep(1000);
		 GetScreenshot(driver,"BMIImage.png");
	}
	
	public void GetScreenshot(WebDriver driver,String Screenshotname) throws IOException{
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 //Step where Capturing of the screenshot happens and placed in logical File object
		 File srcfile = ts.getScreenshotAs(OutputType.FILE);
		 //Common-io - there is FileUtils class 
		 FileUtils.copyFile(srcfile, new File(System.getProperty("user.dir")+"/src/Screenshots/"+ Screenshotname));
	}

}
