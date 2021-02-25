package com.gui.tests.features.page.cartPage;

public class CartPageLocator {

	static final String btnViewBag = "//h5[text()='Your Bag']/following-sibling::a/span[text()='{0}']"; 
	static final String verifyCartPageByTitle = "//h3[text()='Your Bag']";
	static final String btnCheckOut = "//aside//span[text()='Checkout']/parent::button";
}
