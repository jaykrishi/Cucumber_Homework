package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.junit.Assert;
public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	 // Element Library
	 @FindBy(how = How.XPATH, using = "//a[1]/span[1][contains(text(),'Bank & Cash')]")
	 WebElement BankCash;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	 WebElement NewAccount;

	// Methods to interact with the elements
	 public void clickBankCash() {
		  BankCash.click();
		  
		 }

	 public void clickNewAccount()  {
		  NewAccount.click();
		  
		 } 
	 
}
