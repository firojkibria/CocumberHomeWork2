package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase {

	LoginPage loginPage;

	@Given("User is on the techfios login page")
	public void user_is_on_techfios_login_page() {
		initDriver();
		driver.get("https://techfios.com/billing/?ng=login/");
	}

	@When("User enters the {string} in the username field")
	public void user_enters_the_in_the_username_field(String username) {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName(username);

	}

	// @When("User enters password as{string}")
	// public void user_enters_password_as(String password) {
	// loginPage.enterPassword(password);

	// }
	@When("User enters the {string} in the password field")
	public void user_enters_the_in_the_password_field(String password){
		loginPage.enterPassword(password);

	}

	@When("User clicks on {string}")
	public void user_clicks_on(String string) {
		loginPage.clickSignInButton();
	
	}
	@Then("User should land on?dashboard?page")
	public void user_should_land_on_dashboard_page() {

		// Assertion

		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("Page Title is not matchig", expectedTitle, actualTitle);

	}

	@Then("User clicks on BankCash")
	public void user_clicks_on_BankCash() {
		loginPage.clickBankCash();
	}

	@Then("User clicks on NewAccount")
	public void user_clicks_on_NewAccount() {
		loginPage.newAccountButton();
	}

	@Then("User enters accountTitle as {string} in the  account Titlefield in accounts page")
	public void user_enters_accountTitle_as_in_the_account_Titlefield_in_accounts_page(String string) {
		loginPage.entreAccountTitle(string);
	}

	@Then("User enters {string} in the description field in accounts page")
	public void user_enters_in_the_description_field_in_accounts_page(String string) {
		loginPage.entreAccountdescription(string);
	}

	@Then("User enters {string} in the initialBalance field in accounts page")
	public void user_enters_in_the_initialBalance_field_in_accounts_page(String string) {
		loginPage.entreinitialBalance(string);
	}

	@Then("User enters {string} in the accountNumber field in accounts page")
	public void user_enters_in_the_accountNumber_field_in_accounts_page(String string) {
		loginPage.entreAccountNumber(string);
	}

	@Then("User enters {string} in the contactPerson field in accounts page")
	public void user_enters_in_the_contactPerson_field_in_accounts_page(String string) {
		loginPage.enterContractPersonName(string);
	}

	@Then("User enters {string} in the Phone field in accounts page")
	public void user_enters_in_the_Phone_field_in_accounts_page(String string) {
		loginPage.enterPhoneNumber(string);
	}

	@Then("User enters {string} in the internet BankingURL field in accounts page")
	public void user_enters_in_the_internet_BankingURL_field_in_accounts_page(String string) {
		loginPage.enterBankingUrl(string);
	}

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		loginPage.clickSubmitButton();
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {

		String expectedTitle = "Accounts- iBilling";
		String actualTitle = loginPage.getAccountsPageTitle();
		Assert.assertEquals("Page Title is not matchig", expectedTitle, actualTitle);

	}
}