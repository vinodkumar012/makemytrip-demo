package com.makemytrip.objectrepository;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

import com.makemytrip.element.ElementUtils;

public class SearchFlights {
	
	public static WebElement btn_Search(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "searchFlights", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_From(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "depCityCodeAndAirportName", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_To(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "arrCityCodeAndAirportName", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_DepartDate(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "depdateID", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement day_Calendar(AppiumDriver driver, int number) {
		return ElementUtils.returnElementByXpath(driver, "(//android.widget.CheckedTextView[contains(@resource-id,'calendar_day') and @enabled='true'])[" + number + "]", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement tab_returnDate(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "calReturnSelectionText", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement btn_Calendar_OK(AppiumDriver driver) {
		return ElementUtils.returnElementById(driver, "calOK", new Object(){}.getClass().getEnclosingMethod().getName());
	}

}
