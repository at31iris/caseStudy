package base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;

	@BeforeClass
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

// Turn off Chrome’s credential services
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("password_manager_leak_detection", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--incognito");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		System.out.println("Chrome session started successfully");

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
