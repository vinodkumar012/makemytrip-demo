package com.makemytrip.objectrepository;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

public class CreditCardInformation {
	
	public static WebElement txt_CardNumber(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "card_number_editText", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_NameonCard(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "card_name_editText", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_Cvv(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "cvv_editText", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement lst_ExpiryMonth(AppiumDriver driver) {
		return ElementUtils.returnElementByName(driver, "Expiry Month", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement lst_ExpiryYear(AppiumDriver driver) {
		return ElementUtils.returnElementByName(driver, "Expiry Year", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement lst_Value(AppiumDriver driver, String listValue) {
		return ElementUtils.returnElementByName(driver, listValue, new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement lst_SelectCountry(AppiumDriver driver) {
		return ElementUtils.returnElementByName(driver, "Select Country", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_State(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "billing_state_editText", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_City(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "billing_city_editText", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_BillingAddress(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "billing_address_editText", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_ZipCode(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "billing_pin_editText", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement btn_Continue(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "continue_textView", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement lbl_PaymentFailure(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "payment_failure_textView", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement btn_PaymentFailure_OK(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "payment_failure_ok_button", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	

}
