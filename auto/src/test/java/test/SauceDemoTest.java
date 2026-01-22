package test;

import org.testng.annotations.Test;

import base.BaseTest;
import page.SauceDemoCart;
import page.SauceDemoCheckout2;
import page.SauceDemoCheckoutComplete;
import page.SauceDemoCheckoutPage;
import page.SauceDemoInventory;
import page.SauceDemoLogin;

public class SauceDemoTest extends BaseTest {
	@Test
	public void SauceDemo() {
		driver.get("https://www.saucedemo.com/");
		SauceDemoLogin sdl=new SauceDemoLogin(driver);
		sdl.enterCredentialsAndLogin("standard_user","secret_sauce");
		SauceDemoInventory sdi=new SauceDemoInventory(driver);
		sdi.addProductAndClickOnCart();
		SauceDemoCart sdc=new SauceDemoCart(driver);
		sdc.clickCheckout();
		SauceDemoCheckoutPage sdcp=new SauceDemoCheckoutPage(driver);
		sdcp.enterCheckoutDetails("Ashish1", "Tripathi1", "12345");
		SauceDemoCheckout2 sdc2=new SauceDemoCheckout2(driver);
		sdc2.clickFinish();
		SauceDemoCheckoutComplete sdcc=new SauceDemoCheckoutComplete(driver);
		sdcc.verifyMessageAndGoBackToHome();
	}
}
