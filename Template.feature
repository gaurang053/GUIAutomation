Feature: feature information like User authorization Checkout item from cart
  As an existing customer, I can login into the application and 
  Search,Purcase or Return product and See Home or landing page. 

  Scenario Outline: User should be able to land on home page after submitting login screen
    Given End user provider username "<Username>" and password "<Password>"    
    When  Click on login button
    Then Land on home page and see the product information
		
  Examples: Valid
	  	| UserName			| Password			|
	  	| xyz     			| xyz           |