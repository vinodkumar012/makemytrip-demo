package com.makemytrip.element;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementUtils {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ElementUtils.class);
	
	private static final int EXPLICIT_WAIT = 30;
	
	public static WebElement returnElementById(AppiumDriver driver, String id, String methodName) {
		LOGGER.info("waitElementVisible() : waiting for visibility of element"); 
		WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		LOGGER.info("returning " + methodName + " object");
		return driver.findElementById(id);
	}
	
	public static WebElement returnElementByXpath(AppiumDriver driver, String xpath, String methodName) {
		LOGGER.info("waitElementVisible() : waiting for visibility of element"); 
		WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		LOGGER.info("returning " + methodName + " object");
		return driver.findElementByXPath(xpath);
	}
	
	public static WebElement returnElementByName(AppiumDriver driver, String name, String methodName) {
		LOGGER.info("waitElementVisible() : waiting for visibility of element"); 
		WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
		LOGGER.info("returning " + methodName + " object");
		return driver.findElementByName(name);
	}

}
