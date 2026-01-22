package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCheckoutPage {
	WebDriver driver;
	@FindBy(xpath=".//input[@id=\"first-name\"]") WebElement firstName;
	@FindBy(xpath=".//input[@id=\"last-name\"]") WebElement lastName;
	@FindBy(xpath=".//input[@id=\"postal-code\"]") WebElement postalCode;
	@FindBy(xpath=".//input[@id=\"continue\"]") WebElement Continue;
	public SauceDemoCheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterCheckoutDetails(String fName,String lName,String postCode) {
		firstName.sendKeys(fName); // can make this personal info data driven  
		lastName.sendKeys(lName);
		postalCode.sendKeys(postCode);
		Continue.click();
	}
}
