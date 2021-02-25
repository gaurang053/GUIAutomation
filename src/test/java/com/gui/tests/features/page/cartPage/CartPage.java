package com.gui.tests.features.page.cartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gui.tests.features.page.productPage.ProductPageLocator;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class CartPage extends UIInteractionSteps {

	@Step
	public void clickOnViewBagButton(String btnName) {
		findBy(CartPageLocator.btnViewBag,btnName).click();
	}
	
	@Step
	public boolean verifyCartPageByTitle(String pageTitle) {
		return waitForCondition().until(ExpectedConditions.visibilityOf(findBy(CartPageLocator.verifyCartPageByTitle,pageTitle))).isDisplayed();
	}
	@Step
	public void clickOnCheckOutButton() {
		findBy(CartPageLocator.btnCheckOut).click();
	}
}
