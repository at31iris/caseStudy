package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCheckout2 {
	WebDriver driver;
	@FindBy(xpath=".//button[@id=\"finish\"]") WebElement finish;
	public SauceDemoCheckout2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickFinish() {
		finish.click();
	}
}
