package SeleniumPack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class LaunchBrowser {
	public static WebDriver driver = null;
	public static String browser = "chrome";
	public static void main(String[] args) {
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//to launch a browser - we need to create an instance of ChromeDriver class
			//	Ctrl+ Shift+ O
			 driver = new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("ie")){
			System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
			//2 more settings that needs to be performed 
			//Zoom level must be at 100 %
			//Protection Model Level of all security zones are either enabled or disabled
			driver = new InternetExplorerDriver();
		}
		driver.get("https://www.google.com");
	}
}
