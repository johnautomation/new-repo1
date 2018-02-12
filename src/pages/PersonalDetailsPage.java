package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.support.ui.Select;

public class PersonalDetailsPage {

	WebDriver driver;

	By email_add = By.name("email_address");
	By passw = By.name("password");
	By sign_in = By.xpath("//button[@type='submit']");
	By new_product=By.cssSelector("a[href='http://107.170.213.234/catalog/products_new.php']>u");

	/*
	 * By new_customer =By.id("tdb4"); By gen_der = By.name("gender"); By
	 * first_name=By.name("firstname"); By last_name=By.name("lastname"); By Dob
	 * =By.name("dob"); By email_add= By.name("email_address"); By street_add
	 * =By.name("street_address"); By post_code =By.name("postcode"); By
	 * cit_y=By.name("city"); By sta_te =By.name("state"); By dropdown =
	 * By.name("country"); By tele_phone= By.name("telephone"); By pass_word
	 * =By.name("password"); By conf_pass=By.name("confirmation"); By con_tinue
	 * =By.id("tdb4"); By Prod_Detail=By.linkText("new products");
	 */

	public PersonalDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterEmail_ADD(String em_add) {
		driver.findElement(email_add).sendKeys(em_add);
	}

	public void enterPassWord(String Passw) {
		driver.findElement(passw).sendKeys(Passw);
	}

	public void clickSignInButton(){
		driver.findElement(sign_in).click();
	}
		public void clickNew_ProductLink(){
			driver.findElement(new_product).click();
		}
	/*
	 * public void clickNewCustomer(){ driver.findElement(new_customer).click();
	 * } public void clickGenderButton(){ driver.findElement(gen_der).click(); }
	 * public void enterFirstName( String fname){
	 * driver.findElement(first_name).sendKeys(fname);
	 * 
	 * } public void enterLastName( String Lname){
	 * driver.findElement(last_name).sendKeys(Lname); } public void
	 * enterDateOfBirth(String d_ob) { driver.findElement(Dob).sendKeys(d_ob); }
	 * public void enterEmailAddress(String email) {
	 * driver.findElement(email_add).sendKeys(email); }
	 * 
	 * public void enterStreetAddress(String st_add) {
	 * driver.findElement(street_add).sendKeys(st_add); } public void
	 * enterPostalcode(String p_code) {
	 * driver.findElement(post_code).sendKeys(p_code); } public void
	 * enterCity(String c_ity) { driver.findElement(cit_y).sendKeys(c_ity); }
	 * public void enterState(String s_tate) {
	 * driver.findElement(sta_te).sendKeys(s_tate); } public Select dropDown( ){
	 * 
	 * return new Select(driver.findElement(dropdown));
	 * 
	 * } public void enterTelePhone(String t_phone) {
	 * driver.findElement(tele_phone).sendKeys(t_phone); } public void
	 * enterPassw(String p_ass) { driver.findElement(pass_word).sendKeys(p_ass);
	 * } public void enterConfirmPass(String c_pass) {
	 * driver.findElement(conf_pass).sendKeys(c_pass); } public void
	 * clickContinueButton() { driver.findElement(con_tinue).click();
	 * 
	 * 
	 * } public void clickProdDetailLink(){
	 * driver.findElement(Prod_Detail).click();
	 * 
	 * }
	 */

}

