package com.gui.tests.features.page.productPage;

public class ProductPageLocator {
	static final String selectSize = "//button[contains(@class,'gl-label size___TqqSo')][@data-di-id='size_{0}']";
	static final String  btnAddToBag = "//span[text()='{0}']/parent::button" ;
	static final String verifyProductAdded = "//h5[text()='Successfully added to bag!']";
	static final String viewCartPopup = "//button[@class='gl-modal__close']";
}
