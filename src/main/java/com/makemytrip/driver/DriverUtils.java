package com.makemytrip.driver;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(DriverUtils.class);

	private static final int EXPLICIT_WAIT = 30;
	
	public static void waitElementVisible(AppiumDriver driver, WebElement element) {
		LOGGER.info("waitElementVisible() : waiting for visibility of element"); 
		WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void setValue(AppiumDriver driver, WebElement element, String value) {
		waitElementVisible(driver, element);
		LOGGER.info("Entering- " + value + " -in text box");
		element.sendKeys(value);
	}

}
