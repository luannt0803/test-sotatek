package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.HomePageUI;

public class HomePageObject extends BasePage {
	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterToSearchTextbox(String search) {
		waitForElementVisible(driver, HomePageUI.SEARCH_TEXTBOX);
		sendkeyToElement(driver, HomePageUI.SEARCH_TEXTBOX, search);
		sleepInSecond(2);
		pressKeyboardToElement(driver, HomePageUI.SEARCH_TEXTBOX, Keys.ENTER);
		sleepInSecond(3);
	}

	public void clickToAppleCheckbox() {
		waitForElementClickable(driver, HomePageUI.APPLE_CHECKBOX);
		checkToCheckboxOrRadio(driver, HomePageUI.APPLE_CHECKBOX);	
	}

	public boolean verifyTextIphone11Displayed() {
		waitForElementVisible(driver, HomePageUI.IPHONE_11_TEXT);
		return isElementDisplayed(driver, HomePageUI.IPHONE_11_TEXT);	
	}

	public void selectInSortDropdown(String sortDropdownValue) {
		waitForElementClickable(driver, HomePageUI.SORT_PRICE_DROPDOWN);
		selectItemInCustomDropdown(driver, HomePageUI.SORT_PRICE_DROPDOWN, HomePageUI.SUB_SORT_PRICE_DROPDOWN, sortDropdownValue);
	}

	public boolean isSortPriceAscending() {
		waitForElementVisible(driver, HomePageUI.PRODUC_PRICE);
		return isDataFloatSortAscending(driver, HomePageUI.PRODUC_PRICE);
	}



}
