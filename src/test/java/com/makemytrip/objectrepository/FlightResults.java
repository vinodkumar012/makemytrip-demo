package com.makemytrip.objectrepository;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

public class FlightResults {
	
	public static WebElement btn_Book(AppiumDriver driver) {
		return ElementUtils.returnElementByName(driver, "BOOK", new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
