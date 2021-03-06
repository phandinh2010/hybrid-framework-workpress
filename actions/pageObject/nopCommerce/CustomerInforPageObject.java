package pageObject.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.CustomerInforPageUI;
import pageUIs.nopCommerce.HomePageUI;

public class CustomerInforPageObject extends BasePage {
	WebDriver driver;
	
	public CustomerInforPageObject (WebDriver driver) {
		this.driver = driver;
	}

	
	public String getFirstNameTextboxValue() {
		waitForElementVisible(driver, CustomerInforPageUI.FIRSTNAME_TEXTBOX);
		return getElementAttributeValue(driver, CustomerInforPageUI.FIRSTNAME_TEXTBOX);
	}

	public String getLastNameTextboxValue() {
		waitForElementVisible(driver, CustomerInforPageUI.LASTNAME_TEXTBOX);
		return getElementAttributeValue(driver, CustomerInforPageUI.LASTNAME_TEXTBOX);
	}

	public String getEmailTextboxValue() {
		waitForElementVisible(driver, CustomerInforPageUI.EMAIL_TEXTBOX);
		return getElementAttributeValue(driver, CustomerInforPageUI.EMAIL_TEXTBOX);
	}


	public SiteMapPageObject openSiteMapPage() {
	waitForElementClickable(driver, CustomerInforPageUI.SITE_MAP_LINK);
	clickToElement(driver, CustomerInforPageUI.SITE_MAP_LINK);
		return PageGeneratorManager.getSiteMapPage(driver);
	}
	

}
