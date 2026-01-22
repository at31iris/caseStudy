package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoInventory {
	WebDriver driver;
	@FindBy(xpath=".//button[@id=\"add-to-cart-sauce-labs-backpack\"]") WebElement AddToCart;// click
	@FindBy(xpath=".//div[@id=\"shopping_cart_container\"]") WebElement CartIcon;
	public SauceDemoInventory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void addProductAndClickOnCart() {
		AddToCart.click();
		CartIcon.click();
	}
}
