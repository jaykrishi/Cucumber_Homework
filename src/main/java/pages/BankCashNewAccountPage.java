package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankCashNewAccountPage {
	WebDriver driver;

	public BankCashNewAccountPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement InternetBankingUrl;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement SubmitButton;

	// Methods to interact with the elements
	public void enterAccountTitle(String account_title) {
		AccountTitle.sendKeys(account_title);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public void enterDescription(String description) {

		Description.sendKeys(description);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public void enterInitialBalance(String initial_balance) {

		InitialBalance.sendKeys(initial_balance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public void enterAccountNumber(String account_number) {

		AccountNumber.sendKeys(account_number);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void enterContactPerson(String contact_person) {

		ContactPerson.sendKeys(contact_person);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void enterPhone(String phone) {
		Phone.sendKeys(phone);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void enterInternetBankingUrl(String banking_url) {

		InternetBankingUrl.sendKeys(banking_url);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void enterSubmitButton() {
		SubmitButton.click();
	}

}