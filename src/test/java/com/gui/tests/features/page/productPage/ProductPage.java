package com.gui.tests.features.page.productPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gui.tests.features.page.homePage.HomePageLocator;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class ProductPage extends UIInteractionSteps {

	@Step
	public void selectSize(String size) {
		waitForCondition().until(ExpectedConditions.visibilityOf(findBy(ProductPageLocator.selectSize, size))).click();
	}

	@Step
	public void clickOnAddToBag(String btnName) {
		waitForCondition().until(ExpectedConditions.visibilityOf(findBy(ProductPageLocator.btnAddToBag,btnName))).click();
	}
	
	@Step
	public boolean validateProductPresentInCart(String msg) {
		boolean isMatched = false;
		String value = "";
		value =  waitForCondition().until(ExpectedConditions.visibilityOf(find(By.xpath(ProductPageLocator.verifyProductAdded)))).getText();
		if(msg.equalsIgnoreCase(value)) {
			isMatched = true;
		}
		return isMatched;
	}
}
