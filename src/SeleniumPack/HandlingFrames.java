package SeleniumPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//identify frame element 
		WebElement frameElement = driver.findElement(By.className("demo-frame"));

		driver.switchTo().frame(frameElement);
		//driver.switchTo().frame(1); //NoSuchFrameException
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		//Scroll the destination element into view 
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",destination);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, destination).build().perform();
		if(destination.getText().equals("Dropped!")){
			System.out.println("Drop successful");
		}
		else
			System.out.println("Drop was not successful");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//js.executeScript("window.scrollTo(0, 300)");

	}
}
