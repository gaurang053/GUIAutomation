package com.gui.tests.features.steps.stepDefinition;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import com.gui.tests.features.page.Delivery.DeliveryPage;
import com.gui.tests.features.page.cartPage.CartPage;
import com.gui.tests.features.page.homePage.HomePage;
import com.gui.tests.features.page.productPage.ProductPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductCheckoutSteps {

	@Steps
	HomePage homePage; 
	
	@Steps
	ProductPage productPage;
	
	@Steps
	CartPage cartPage;
	
	@Steps
	DeliveryPage deliveryPage;
	
	@Given("Search for the word {string} and from the opened page, click on the first product")
	public void search_for_the_word_and_from_the_opened_page_click_on_the_first_product(String keyWord) {
		homePage.open();
		homePage.verifyUserInHomePage();
		homePage.selectCountry("United Kingdom");
		homePage.acceptTrackingCookies();
		homePage.searchProductWithKeyword(keyWord);
		homePage.selectFirstProduct();
		homePage.signUpPageCloseIfAppear();
	}

	@And("Verify that you have navigated to the correct product page by checking the URL {string}")
	public void verify_that_you_have_navigated_to_the_correct_product_page_by_checking_the_URL(String keyword) {
		if(homePage.getDriver().getCurrentUrl().contains(keyword)) {
			System.out.println("Product page is corret based on search keyword");
		}else {
			System.out.println("Product page is not corret based on search keyword");
		}
		System.out.println("Web Page URL" + homePage.getDriver().getCurrentUrl() + "vs" + keyword);
	}

	@When("Pick any size and click on {string} button")
	public void pick_any_size_and_click_on_button(String btnName) {
		productPage.selectSize("4.5");
		productPage.clickOnAddToBag(btnName);
	}

	@And("Verify that you have successfully added one item to the bag")
	public void verify_that_you_have_successfully_added_one_item_to_the_bag() {
		boolean returnValue = productPage.validateProductPresentInCart("SUCCESSFULLY ADDED TO BAG!");
		Assert.assertEquals("Cart is not empty",true,returnValue);
	}

	@Then("Click on {string} button and navigate to the cart page")
	public void click_on_button_and_navigate_to_the_cart_page(String btnName) {
		cartPage.clickOnViewBagButton(btnName);
	}

	@And("Verify that you are on the cart page by the title {string}")
	public void verify_that_you_are_on_the_cart_page_by_the_title(String pageTitle) {
		boolean returnValue = cartPage.verifyCartPageByTitle(pageTitle);
		Assert.assertEquals("Page title is matched",true,returnValue);
	}

	@Then("click on the Checkout button")
	public void click_on_the_Checkout_button() {
		cartPage.clickOnCheckOutButton();
	}

	@And("Verify that you're on the delivery page")
	public void verify_that_you_re_on_the_delivery_page() {
		String pageTitle  = deliveryPage.verifyDeliveryPageByTitle("");
		Assert.assertEquals("Page title is matched","Get your order",pageTitle);
	}

	@Then("from the {string} module")
	public void from_the_module(String string) {
		deliveryPage.clickOnFromACollectionPoint();
	}

	@And("click {string}")
	public void click(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(ProductCheckoutSteps.class.getName());
	}

	@Then("type {string} in the location text box")
	public void type_in_the_location_text_box(String locationName) {
		deliveryPage.typeAndSelectPickupLocation(locationName);
	}

	@Then("click {string} button")
	public void click_button(String string) {
		deliveryPage.clickOnCollectionPointButton();
	}

	@Then("from the list, pick any collection point")
	public void from_the_list_pick_any_collection_point() {
		deliveryPage.pickAnyCollectionPoint();
	}

	@And("Verify that correct collection point is selected")
	public void verify_that_correct_collection_point_is_selected() {
		deliveryPage.verifyCorrectCollectionPoint();
	}

}
