package SeleniumPack;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LaunchBrowser {
	public static String browser = "firefox";

	public static void main(String[] args) {
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//to launch a browser - we need to create an instance of ChromeDriver class
			//	Ctrl+ Shift+ O
			ChromeDriver driver = new ChromeDriver();
			//	navigate to the url 
			driver.get("https://www.google.com/");
		}else if (browser.equals("firefox"))
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			FirefoxDriver fdriver = new FirefoxDriver();
			fdriver.get("https://www.google.com/");
	}
}
