package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	public WebElement UserName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	public WebElement Password;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	public WebElement SignInButton;

	// Other web Elements
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	public WebElement BankCashButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	public WebElement NewAccountButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	public WebElement AccountTitleField;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	public WebElement AccountdescriptionField;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	public WebElement InitialBalanceField;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	public WebElement AccountNumberField;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	public WebElement ContactPersonField;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	public WebElement PhoneNumberField;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	public WebElement BankingUrlField;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	public WebElement SubmitButton;

	// Methods to interact with the elements
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickSignInButton() {
		SignInButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickBankCash() {
		BankCashButton.click();

	}

	public void newAccountButton() {

		NewAccountButton.click();

	}

	public void entreAccountTitle(String accountTitle) {

		AccountTitleField.sendKeys(accountTitle);
	}

	public void entreAccountdescription(String description) {

		AccountdescriptionField.sendKeys(description);
	}

	public void entreinitialBalance(String balance) {

		InitialBalanceField.sendKeys(balance);
	}

	public void entreAccountNumber(String account) {

		AccountNumberField.sendKeys(account);
	}

	public void enterContractPersonName(String personName) {
		ContactPersonField.sendKeys(personName);
	}

	public void enterPhoneNumber(String Phone) {
		PhoneNumberField.sendKeys(Phone);

	}

	public void enterBankingUrl(String Url) {
		BankingUrlField.sendKeys(Url);

	}

	public void clickSubmitButton() {
		SubmitButton.click();

	}

	public String getAccountsPageTitle() {
		return driver.getTitle();
	}

}