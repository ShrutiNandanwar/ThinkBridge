package jabaTalks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	
		public static WebDriver callBrowser(){
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium jar files\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
			driver.manage().window().maximize();
			return driver;
		}

	

}
