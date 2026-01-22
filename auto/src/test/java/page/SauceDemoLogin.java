package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLogin {
	WebDriver driver;
	@FindBy(xpath=".//input[@id=\"user-name\"]") WebElement userName;
	@FindBy(xpath=".//input[@id=\"password\"]") WebElement password;
	@FindBy(xpath=".//input[@id=\"login-button\"]")WebElement Login;
	public SauceDemoLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterCredentialsAndLogin(String user,String passkey) {
		userName.sendKeys(user);
		password.sendKeys(passkey);
		Login.click();
	}
}
