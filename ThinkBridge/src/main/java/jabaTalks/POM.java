package jabaTalks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	@FindBy(xpath="//div[@placeholder='Choose Language']")
		private	WebElement language;
	@FindBy(xpath="//div[text()='English']")
		private WebElement engLanguage;
	@FindBy(xpath="//div[text()='Dutch']")
		private WebElement dutchLanguage;
	@FindBy(xpath="//input[@id='name']")
		private WebElement name;
	@FindBy(xpath="//input[@name='orgName']")
		private WebElement organizationName;
	@FindBy(xpath="//input[@name='email']")
		private WebElement email;
	@FindBy(xpath="//span[@class='black-color ng-binding']")
		private WebElement tickBox;
	@FindBy(xpath="//button[@type='submit']")
		private WebElement signUp;
	
	public POM(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	
	public  void  clickOnSetLanguage() {
		language.click();		
	}
	
	public void clickOnEnglishLanguage() {
		engLanguage.click();
	}
	
	public void clickOnDutchLanguage() {
		dutchLanguage.click();
	}
	
	public void setName(String uname) {
		name.sendKeys(uname);
	}
	
	public void setOrganizationName(String orgName) {
		organizationName.sendKeys(orgName);
	}
	
	public void setEmailId(String uemail) {
		email.sendKeys(uemail);
	}
	
	public void clickOnTickBox() {
		tickBox.click();
	}
	
	public void clickOnSignUp() {
		signUp.click();
	}
}