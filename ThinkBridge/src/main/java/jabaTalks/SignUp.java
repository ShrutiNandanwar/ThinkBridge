package jabaTalks;

import org.openqa.selenium.WebDriver;

public class SignUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.callBrowser();
		Thread.sleep(2000);
		POM userSignup= new POM(driver);
		userSignup.clickOnSetLanguage();
		userSignup.clickOnEnglishLanguage();
		userSignup.setName("Shruti");
		userSignup.setOrganizationName("Shruti");
		userSignup.setEmailId("sn@123.com");
		userSignup.clickOnTickBox();
		userSignup.clickOnSignUp();
		
	}

	
}
