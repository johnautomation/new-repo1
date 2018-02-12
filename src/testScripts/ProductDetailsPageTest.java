package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PersonalDetailsPage;
import pages.ProductDetailsPage;

public class ProductDetailsPageTest {
	WebDriver driver;
	// LaunchBrowser launch;
	PersonalDetailsPage perpage;
	ProductDetailsPage home;

	@BeforeTest
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://107.170.213.234/catalog/login.php");
		driver.manage().window().maximize();
	}

	@Test
	public void assertProductDetailspage() {
		// startBrowser();
		System.out.println("Browser was successfully launched");
		perpage = new PersonalDetailsPage(driver);
		perpage.enterEmail_ADD("johnyk2020@gmail.com");
		perpage.enterPassWord("merkato");
		perpage.clickSignInButton();
		home = new ProductDetailsPage(driver);
		home.clickNew_ProductLink();
		home.clickBladeRunner_prod();
		home.addBladeRunnerToCart();
		home.checkoutBladeRunnerProd();
		home.clickOnDeliveryInfo();
		home.clickPaymentCashOnDelivery();
		home.clickOnPaymentToConf();
		home.clickOnOrderConf();
		home.clickCheckBoxBladeRunner();
		 
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
