package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.Utils;

public class PageBase {
	public static WebDriver driver;
	public static String browserName;
	
	public static WebDriver openBrowser(String browserType) {
		browserName=Utils.getFileProperty(browserType);
		try{
		 if(browserName.equalsIgnoreCase("Chrome")) {
			 	ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Saucedemo\\drivers\\chromedriver.exe");
				driver = new ChromeDriver(options);
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 }
		 else if(browserName.equalsIgnoreCase("Firefox")) {
			 	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Saucedemo\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 }
		 else if(browserName.equalsIgnoreCase("Edge")) {
			 	System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\Saucedemo\\drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 }
 
		}
		catch (Exception e) {
			System.out.println("Error in Launching Browser"+e.toString());
		}
		return driver;
	}	
		public static WebDriver tearDown() {
			try {
				driver.quit();
			}
			catch(Exception e){
				System.out.println("Failed to close Browser "+e.toString());
			}
			return driver;
		}
}
