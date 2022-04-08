package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BankCashNewAccountPage;
import pages.DashboardPage;
import pages.DatabasePage;
import pages.ListBankCashAccount;
import pages.LoginPage;
import pages.TestBase;

public class BankStepDefinition extends TestBase{
	LoginPage loginPage;
	DatabasePage databasepage;
	DashboardPage dashboardPage;
	BankCashNewAccountPage bankcashNewPage;
	ListBankCashAccount listbankcashPage;
	
	public void bankSetUp() {
	bankcashNewPage = PageFactory.initElements(driver, BankCashNewAccountPage.class);
	listbankcashPage = PageFactory.initElements(driver, ListBankCashAccount.class);
	}
	
	@When("^User enters accountTitle as \"([^\"]*)\" in accounts page$")
	public void user_enters_accountTitle_as_in_accounts_page(String accountTitle) {
		bankSetUp();
		bankcashNewPage.enterAccountTitle(accountTitle + generateRandom(999));

	}

	@When("^User enters description as \"([^\"]*)\" in accounts page$")
	public void user_enters_description_as_in_accounts_page(String description) {
		bankcashNewPage.enterDescription(description);
	}

	@When("^User enters initialBalance as \"([^\"]*)\" in accounts page$")
	public void user_enters_initialBalance_as_in_accounts_page(String initialBalance) {
		bankcashNewPage.enterInitialBalance(initialBalance);
	}

	@When("^User enters accountNumber as \"([^\"]*)\" in accounts page$")
	public void user_enters_accountNumber_as_in_accounts_page(String accountNumber) {
		bankcashNewPage.enterAccountNumber(accountNumber + generateRandom(999));
	}

	@When("^User enters contactPerson as \"([^\"]*)\" in accounts page$")
	public void user_enters_contactPerson_as_in_accounts_page(String contactPerson) {
		bankcashNewPage.enterContactPerson(contactPerson);
	}

	@When("^User enters Phone as \"([^\"]*)\" in accounts page$")
	public void user_enters_Phone_as_in_accounts_page(String phone) {
		bankcashNewPage.enterPhone(phone + generateRandom(999));

	}

	@When("^User enters internetBankingUrl as \"([^\"]*)\" in accounts page$")
	public void user_enters_internetBankingUrl_as_in_accounts_page(String bankingUrl) {
		bankcashNewPage.enterInternetBankingUrl(bankingUrl);
	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully() {
		
		listbankcashPage.getAccountHeader();

		//Assert.assertEquals("Manage Accounts",listbankcashPage.getAccountHeader() );
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// 

			e.printStackTrace();
		}
		takeScreenShot(driver);

	}

	
}
