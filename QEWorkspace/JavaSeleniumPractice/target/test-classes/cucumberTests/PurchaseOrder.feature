
Feature: Purchase order test

	Background:
	Given I landed on Ecomm page
	
  Scenario Outline: Order placement test
    Given logged in with username <username> and password <password>
    When I add product <productName> to the cart
    And checkout <productName> and submit the order
    Then I verify the message "THANKYOU FOR THE ORDER."
    
  Examples: 
      | username  									| password 				| productName |
      | prasadaraopuppala@gmail.com | Target@2024 		| QWERTY 			|
   