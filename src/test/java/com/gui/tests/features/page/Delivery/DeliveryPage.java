package com.gui.tests.features.page.Delivery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class DeliveryPage extends UIInteractionSteps {

	@Step
	public String verifyDeliveryPageByTitle(String pageTitle) {
		WebElement element = waitForCondition()
				.until(ExpectedConditions.visibilityOf(find(By.xpath(DeliveryPageLocator.deliveryPageTitle))));
		return element.getText();
	}

	@Step
	public void clickOnFromACollectionPoint() {
		find(DeliveryPageLocator.fromACollectionPoint).click();
	}

	@Step
	public void typeAndSelectPickupLocation(String name) {
		find(DeliveryPageLocator.txtSelectCountry).typeAndEnter(name);
	}

	@Step
	public void clickOnCollectionPointButton() {
		find(DeliveryPageLocator.searchCollectionPoint).click();
	}

	@Step
	public String pickAnyCollectionPoint() {
		waitForCondition().until(ExpectedConditions.visibilityOf(find(DeliveryPageLocator.clickShowDetails))).click();
		String address = find(DeliveryPageLocator.readStoreDetails).getText();
		waitForCondition().until(ExpectedConditions.visibilityOf(find(DeliveryPageLocator.collectHere))).click();
		return address;
	}

	@Step
	public String verifyCorrectCollectionPoint() {
		WebElement elelemnt = waitForCondition().until(ExpectedConditions.visibilityOf(find(DeliveryPageLocator.verifylocation)));
		return elelemnt.getText();
	}

}
