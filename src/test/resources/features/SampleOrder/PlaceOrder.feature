Feature: Checkout item from cart
  As an existing customer of the shopping website,
  I should be able to search and add product to cart, proceed to checkout and 
  Verify that correct collection point is selected

  Scenario Outline: User should be able to checkout and verify the order details
    Given Search for the word "<Keyword>" and from the opened page, click on the first product    
    And  Verify that you have navigated to the correct product page by checking the URL "Running"
    When Pick any size and click on "Add To Bag" button
    And Verify that you have successfully added one item to the bag
    Then Click on "View Bag" button and navigate to the cart page
    And Verify that you are on the cart page by the title "Your Bag"
		Then click on the Checkout button
		And Verify that you're on the delivery page
		Then from the "Get Your Order" module
		And click "From A Collection Point"
		Then type "London" in the location text box
		Then click "Search for Collection Points" button
		Then from the list, pick any collection point
		And Verify that correct collection point is selected
		
  Examples: Valid
	  	| Keyword			|
	  	| running			|
