package testScripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SortProductNamePage;
public class SortProductNamePageTest {
	
	WebDriver driver;
	SortProductNamePage sortprod;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://107.170.213.234/catalog/login.php");
		driver.manage().window().maximize();

	}

	@Test
	public void VerifySortProd_Name() {
		//setUp();
		System.out.println("Browsers was successfully launched");
		sortprod = new SortProductNamePage(driver);
		sortprod.getManufName().selectByVisibleText("Microsoft");
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}


