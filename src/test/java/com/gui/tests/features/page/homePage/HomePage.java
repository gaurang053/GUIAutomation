package com.gui.tests.features.page.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class HomePage extends UIInteractionSteps{
	
	 @Step
	  public void selectFirstProduct() {
		 WebElement element = findBy(HomePageLocator.selectFirstProductFromAList);
		 waitForCondition().until(
			        ExpectedConditions.visibilityOf(element)).click();

	  }

	  @Step
	  public void searchProductWithKeyword(String keyword) {
		  findBy(HomePageLocator.inputSearchProduct).sendKeys(keyword);
		  findBy(HomePageLocator.inputSearchProduct).click();
	  }
	  
	  @Step
	  public void verifyUserInHomePage() {
	    waitForCondition().until(ExpectedConditions.titleIs("adidas Official Website UK | Sportswear"));
	  }
	  
	  @Step
	  public void selectCountry(String countryName) {
		 waitForCondition().until(ExpectedConditions.visibilityOf(findBy(HomePageLocator.selectCountry,countryName))).click(); 
		 waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageLocator.btnGo))).click();
		 findBy(HomePageLocator.btnGo).click();
	  }
	  
	  @Step
	  public void acceptTrackingCookies() {
		  waitForCondition().until(ExpectedConditions.visibilityOf(findBy(HomePageLocator.acceptCookies))).click(); 
		  
	  }

	public void signUpPageCloseIfAppear() {
		waitForCondition().until(ExpectedConditions.visibilityOf(findBy(HomePageLocator.signUpPagePopup)));
		if(findBy(HomePageLocator.signUpPagePopup).isDisplayed()) {
			findBy(HomePageLocator.signUpPagePopup).click();
		}
		
	}
}
