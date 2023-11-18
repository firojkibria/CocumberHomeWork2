Feature: Techfios Other billing login page functionality validation

 Background: 
    Given User is on the techfios login page

Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	When User enters the "<username>" in the username field
	When User enters the "<password>" in the password field
	And User clicks on "login"

   
    Then User should land on?dashboard?page
    And User clicks on BankCash
    And User clicks on NewAccount
    And User enters accountTitle as "My First CD" in the  account Titlefield in accounts page
    And User enters "Kids College Fund" in the description field in accounts page
    And User enters "100000" in the initialBalance field in accounts page
    And User enters "9999" in the accountNumber field in accounts page
    And User enters "Mota Bhai" in the contactPerson field in accounts page
    And User enters "2149992929" in the Phone field in accounts page
    And User enters "https://mybank.com" in the internet BankingURL field in accounts page
    And User clicks on submit button
    Then User should be able to validate account created successfully

    Examples: 
	|username |password|
	|demo@techfios.com|abc123|
	|deme1@rechfios.com|abc123|