package com.makemytrip.objectrepository;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import com.makemytrip.element.ElementUtils;

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
	
	public static WebElement btn_Done(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "pax_add_traveller_button", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_Email(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "pax_email", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_PhoneNumber(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "pax_phone_number", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement btn_BookFlight(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "book_flight_text_view", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement btn_RemoveInsurance(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "flight_remove_insurance_button", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement btn_FareIncrease_Continue(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "button_fare_change_continue", new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
