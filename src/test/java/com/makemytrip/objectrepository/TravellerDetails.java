package com.makemytrip.objectrepository;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

public class TravellerDetails {
	
	public static WebElement btn_AddNewAdult(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "traveller_add_new_adult", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_FirstName(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "pax_first_name", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_LastName(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "pax_last_name", new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
