package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SortProductNamePage {

	WebDriver driver;
	
	By Prod_DropDown= By.name("manufacturers_id");
	
	
	public SortProductNamePage(WebDriver driver){
		this.driver=driver;
		
	}
	
	
	public Select getManufName(){
				
		return new Select(driver.findElement(Prod_DropDown));
	}
}



