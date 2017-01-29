package com.makemytrip.objectrepository;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import com.makemytrip.element.ElementUtils;

public class PaymentMode {
	
	public static WebElement btn_CreditCard(AppiumDriver driver) {
		return ElementUtils.returnElementByName(driver, "Credit Card", new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
