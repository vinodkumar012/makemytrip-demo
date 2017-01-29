package com.makemytrip.objectrepository;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;

public class SearchFlights {
	
	public static WebElement btn_Search(AppiumDriver driver) {
		return LocatorUtils.returnElementById(driver, "searchFlights", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_From(AppiumDriver driver) {
		return LocatorUtils.returnElementById(driver, "depCityCodeAndAirportName", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_To(AppiumDriver driver) {
		return LocatorUtils.returnElementById(driver, "arrCityCodeAndAirportName", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement txt_DepartDate(AppiumDriver driver) {
		return LocatorUtils.returnElementById(driver, "depdateID", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	public static WebElement day_Calendar(AppiumDriver driver, int number) {
		return LocatorUtils.returnElementByXpath(driver, "(//android.widget.CheckedTextView[contains(@resource-id,'calendar_day') and @enabled='true'])[" + number + "]", new Object(){}.getClass().getEnclosingMethod().getName());
	}
	
	
	
	

}
