package SeleniumPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopups {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		JavascriptExecutor js = null;
		Alert alert = null;
		String alertMesg = null;
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.calculator.net/calorie-calculator.html");
		 driver.manage().window().maximize();
		 //Invoke a JavaScript alert to popup an information Alert
		 //for this we use an interface named JavascriptExecutor
		 //when we cast the driver object with JavascriptExecutor, it exposes the
		 //method executeScript which is used for executing or invoking javascripts
		 js = (JavascriptExecutor)driver;
		 js.executeScript("alert('This is an information Message');");
		 //Switch to the Alert is necessary to handle the alert - otherwise we cannot perform any operation
		 //on alert
	     alert = driver.switchTo().alert();
		 alertMesg = alert.getText();
		 Thread.sleep(3000);
	     alert.accept(); //Click on OK button
		 if(alertMesg.equals("This is an information Message")){
			 System.out.println("Alert Message - Match Found");
		 }
		 else
		 {
			 System.out.println("Alert Message - Match Not Found");
		 }
		 
		 js = (JavascriptExecutor)driver;
		 js.executeScript("confirm('Do you want to continue(y/n)?');");
		 //Switch to the Alert is necessary to handle the alert - otherwise we cannot perform any operation
		 //on alert
	     alert = driver.switchTo().alert();
		 alertMesg = alert.getText();
		 Thread.sleep(3000);
		 alert.dismiss();; //Click on Cancel button
		 if(alertMesg.equals("This is an information Message")){
			 System.out.println("Alert Message - Match Found");
		 }
		 else
		 {
			 System.out.println("Alert Message - Match Not Found");
		 }
	}
}
