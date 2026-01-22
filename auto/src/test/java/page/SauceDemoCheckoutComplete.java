package page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemoCheckoutComplete {
	WebDriver driver;
	@FindBy(xpath = ".//h2[contains(text(),\"Thank you for your order!\")]")
	WebElement orderSuccessMessage;
	@FindBy(xpath = ".//button[contains(text(),\"Back Home\")]")
	WebElement backToHome;

	public SauceDemoCheckoutComplete(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyMessageAndGoBackToHome() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(orderSuccessMessage));
	}
}
