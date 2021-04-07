package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {
	static WebDriver driver = null;
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/bmi-calculator.html");
		driver.manage().window().maximize();
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0, 300)");
		WebElement bmilink = driver.findElement(By.linkText("BMI"));
		js.executeScript("arguments[0].scrollIntoView();",bmilink);
	}

}

