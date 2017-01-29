package com.makemytrip.objectrepository;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import com.makemytrip.element.ElementUtils;

public class AddMeals {
	
	public static WebElement btn_Skip(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "tvSkipClearView", new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
