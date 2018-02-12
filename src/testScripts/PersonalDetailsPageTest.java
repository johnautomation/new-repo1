package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PersonalDetailsPage;

public class PersonalDetailsPageTest   {
		
		WebDriver driver;
    	//LaunchBrowser launch;
		PersonalDetailsPage home;
		
		
		@BeforeTest
		public void startBrowser(){
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://107.170.213.234/catalog/login.php");
			driver.manage().window().maximize();
		}
		
		@Test
		public void assertHomepage() throws InterruptedException{
			//startBrowser();
			System.out.println("Browser was successfully launched");
			home = new PersonalDetailsPage(driver);
			home.enterEmail_ADD("johnyk2020@gmail.com");
			home.enterPassWord("merkato");
			home.clickSignInButton();
			home.clickNew_ProductLink();
			System.out.println("Attempted login");
			Assert.assertEquals(driver.getTitle(), "iBusiness");
		  
		}
		
				
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
}

	


