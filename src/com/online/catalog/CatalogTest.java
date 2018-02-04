package com.online.catalog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CatalogTest {

	public WebDriver driver;

	@BeforeTest

	public void setUpBrowser() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void testLoginCustomer() throws InterruptedException {
		// creating new user
		driver.get("http://107.170.213.234/catalog/login.php");
		Thread.sleep(3000);
		driver.findElement(By.id("tdb4")).click();
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("firstname")).sendKeys("akelilu");
		driver.findElement(By.name("lastname")).sendKeys("kebede");
		driver.findElement(By.name("dob")).sendKeys("10/20/1983");
		driver.findElement(By.name("email_address")).sendKeys("kebede09@yahoo.com");
		driver.findElement(By.name("street_address")).sendKeys("123fork ave");
		driver.findElement(By.name("postcode")).sendKeys("237-1000");
		driver.findElement(By.name("city")).sendKeys("cambell");
		driver.findElement(By.name("state")).sendKeys("CA");
		Select sel = new Select(driver.findElement(By.name("country")));
		sel.selectByVisibleText("United States");
		driver.findElement(By.name("telephone")).sendKeys("571-263-0202");
		driver.findElement(By.name("password")).sendKeys("mesfin");
		driver.findElement(By.name("confirmation")).sendKeys("mesfin");
		driver.findElement(By.id("tdb4")).click();
		System.out.println("The Title is===========" + driver.getTitle());
		//Validation point
		Assert.assertEquals("iBusiness", driver.getTitle());
		driver.findElement(By.id("tdb5")).click();
		

	}

	@Test
	public void testNewProductLink() throws InterruptedException {
		// * Purchase Blade Runner - Director's Cut movie
		driver.findElement(By.linkText("new products")).click();
		driver.findElement(By.linkText("Blade Runner - Director's Cut")).click();
		driver.findElement(By.id("tdb5")).click();
		driver.findElement(By.id("tdb6")).click();
		driver.findElement(By.id("tdb6")).click();
		driver.findElement(By.name("payment")).click();
		driver.findElement(By.id("tdb6")).click();
		driver.findElement(By.id("tdb5")).click();
		driver.findElement(By.name("notify[]")).click();
		driver.findElement(By.id("tdb5")).click();

	}

	@Test
	public void testSortProductManufacturer() throws InterruptedException {
		// Sort product by Manufacturers - sort with Microsoft.
		Select sel = new Select(driver.findElement(By.name("manufacturers_id")));
		sel.selectByVisibleText("Microsoft");

	}

	@AfterTest

	public void tearDown() {
		driver.quit();
	}

}
