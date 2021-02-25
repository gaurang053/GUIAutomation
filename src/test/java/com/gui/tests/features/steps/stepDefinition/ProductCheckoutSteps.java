package com.gui.tests.features.steps.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductCheckoutSteps {

	@Given("Search for the word {string} and from the opened page \\(PLP) click on the first product")
	public void search_for_the_word_and_from_the_opened_page_PLP_click_on_the_first_product(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(ProductCheckoutSteps.class.getName());
	}

	@And("Verify that you have navigated to the correct product page by checking the URL")
	public void verify_that_you_have_navigated_to_the_correct_product_page_by_checking_the_URL() {
		// Write code here that turns the phrase above into concrete actions
	    System.out.println(ProductCheckoutSteps.class.getName());
	}

	@When("Pick any size and click on {string} button")
	public void pick_any_size_and_click_on_button(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@And("Verify that you have successfully added one item to the bag")
	public void verify_that_you_have_successfully_added_one_item_to_the_bag() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@Then("Click on {string} button and navigate to the cart page")
	public void click_on_button_and_navigate_to_the_cart_page(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@And("Verify that you are on the cart page by the title {string}")
	public void verify_that_you_are_on_the_cart_page_by_the_title(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@Then("click on the Checkout button")
	public void click_on_the_Checkout_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@And("Verify that you're on the delivery page")
	public void verify_that_you_re_on_the_delivery_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@Then("from the {string} module")
	public void from_the_module(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@And("click {string}")
	public void click(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@Then("type {string} in the location text box")
	public void type_in_the_location_text_box(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@Then("click {string} button")
	public void click_button(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@Then("from the list, pick any collection point")
	public void from_the_list_pick_any_collection_point() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@And("Verify that correct collection point is selected")
	public void verify_that_correct_collection_point_is_selected() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

}
