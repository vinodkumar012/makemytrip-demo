package com.makemytrip.objectrepository;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchFlights {
	private static final Logger LOGGER = LoggerFactory.getLogger(SearchFlights.class);
	
	public static WebElement btn_Search(AppiumDriver driver) {
		LOGGER.info("returning btn_Search object");
		return driver.findElementById("searchFlights");
	}
	
	public static WebElement txt_From(AppiumDriver driver) {
		LOGGER.info("returning txt_From object");
		return driver.findElementById("depCityCodeAndAirportName");
	}
	
	public static WebElement txt_To(AppiumDriver driver) {
		LOGGER.info("returning txt_From object");
		return driver.findElementById("arrCityCodeAndAirportName");
	}

}
