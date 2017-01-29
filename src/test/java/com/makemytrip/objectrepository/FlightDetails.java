package com.makemytrip.objectrepository;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

public class FlightDetails {
	
	public static WebElement btn_Continue(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "continue_text", new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
