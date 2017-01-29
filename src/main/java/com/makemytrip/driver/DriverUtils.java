package com.makemytrip.driver;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(DriverUtils.class);

	public static void setValue(WebElement element, String value) {
		LOGGER.info("Entering- " + value + " -in text box");
		element.sendKeys(value);
	}
	
	public static void press(WebElement eleemnt) {
		LOGGER.info("clicking on eleemnt");
		eleemnt.click();
	}
	
	public static void hideKeyBoard(AppiumDriver<WebElement> driver) {
		driver.hideKeyboard();
	}

}
