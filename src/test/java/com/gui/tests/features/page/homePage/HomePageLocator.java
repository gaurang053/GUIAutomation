package com.gui.tests.features.page.homePage;

import java.util.List;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("page:home.page")
public class HomePageLocator extends PageObject {
	static final String inputSearchProduct = "//input[@placeholder='Search']";
	static final String selectFirstProductFromAList = "//ul[@data-auto-id='glass-search-products']/li[2]/a";
	static final String selectCountry = "//span[text()='{0}'][@class='gl-radio-input__label']";
	static final String btnGo =	"//span[text()='Go'][@class='gl-cta__content']";
	static final String acceptCookies = "//span[@class='gl-cta__content'][text()='Accept tracking']";
	static final String signUpPagePopup = "//button[@class='gl-modal__close']";
}
