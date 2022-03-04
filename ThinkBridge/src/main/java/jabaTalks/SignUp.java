package jabaTalks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium jar files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement language = driver.findElement(By.xpath("//div[@placeholder='Choose Language']"));
		language.click();
		WebElement engLanguage = driver.findElement(By.xpath("//div[text()='English']"));
		engLanguage.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Shruti");
		WebElement orgName = driver.findElement(By.xpath("//input[@name='orgName']"));
		orgName.sendKeys("Shruti");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("sn@gmail.com");
		WebElement tickBox = driver.findElement(By.xpath("//span[@class='black-color ng-binding']"));
		tickBox.click();
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
	}

	
}
