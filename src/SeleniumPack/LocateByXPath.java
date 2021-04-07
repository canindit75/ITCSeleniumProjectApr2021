package SeleniumPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocateByXPath {
	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.calculator.net/calorie-calculator.html");
		 driver.manage().window().maximize();
		 WebElement AgeLabelByAbsXPath =driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/table[1]/tbody/tr[1]/td[1]"));
		 System.out.println("AgeLabel by Abs XPath = " + AgeLabelByAbsXPath.getText());
		 
		 WebElement AgeLabelByRelXPath = driver.findElement(By.xpath("//*[@id='calinputtable']/tbody/tr[1]/td[1]"));
		 System.out.println("AgeLabel by Rel XPath = " + AgeLabelByRelXPath.getText());
	}
}
