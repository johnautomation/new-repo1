package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ProductDetailsPage {
	WebDriver driver;

	By new_product = By.linkText("new products");
	By blade_prod = By.linkText("Blade Runner - Director's Cut");
	By add_bladecart = By.id("tdb5");
	By checkout_blade = By.id("tdb6");
	By shipping_info = By.id("tdb6");
	By cashondelivery = By.name("payment");

	By payment_info = By.id("tdb6");
	By order_confirm = By.id("tdb5");
	By check_order = By.name("notify[]");
	By order_proc = By.id("tdb5");
	By Select  = By.name("country");
	//sel.selectByVisibleText("United States");
	

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickNew_ProductLink() {
		driver.findElement(new_product).click();
	}

	public void clickBladeRunner_prod() {
		driver.findElement(blade_prod).click();
	}

	public void addBladeRunnerToCart() {
		driver.findElement(add_bladecart).click();
	}

	public void checkoutBladeRunnerProd() {
		driver.findElement(checkout_blade).click();
	}

	public void clickOnDeliveryInfo() {
		driver.findElement(shipping_info).click();
	}

	public void clickPaymentCashOnDelivery() {
		driver.findElement(cashondelivery).click();
	}

	public void clickOnPaymentToConf() {
		driver.findElement(payment_info).click();
	}

	public void clickOnOrderConf() {
		driver.findElement(order_confirm).click();
	}

	public void clickCheckBoxBladeRunner() {
		driver.findElement(check_order).click();
	}
	
	
}
