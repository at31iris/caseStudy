package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCart {
	WebDriver driver;
	@FindBy(xpath=".//button[@id=\"checkout\"]") WebElement checkout;
	public SauceDemoCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickCheckout() {
		checkout.click();
	}
}
