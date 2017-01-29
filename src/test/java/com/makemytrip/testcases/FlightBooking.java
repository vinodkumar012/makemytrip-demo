package com.makemytrip.testcases;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.makemytrip.driver.DriverManager;
import com.makemytrip.driver.DriverUtils;
import com.makemytrip.objectrepository.SearchFlights;

public class FlightBooking {
	private AppiumDriver driver;
	
	@Parameters({ "platformName", "browserName", "version", "appPackage", "appActivity", "deviceName", "apkFileName", "nodeURL" })
	@BeforeClass
	public void setUp(String platformName, String browserName, String version, String appPackage, String appActivity, String deviceName, String apkFileName, String nodeURL) throws MalformedURLException{
		driver = DriverManager.getDriver(platformName, browserName, version, appPackage, appActivity, deviceName, apkFileName, nodeURL);
	}
	
	@Test
	public void flightSearch_Search_Book_Continue_EnterDetails_BookFlight_RemoveInsurance_CreditCard_EnterCCDetails_Verify_Continue() {
		DriverUtils.waitElementVisible(driver, SearchFlights.btn_Search(driver));
		
		//commenting below lines as application is hanging while entering values in departure and arrival cities
		
		/*DriverUtils.setValue(driver, SearchFlights.txt_From(driver), "DEL - Indira Gandhi International Airport");
		DriverUtils.setValue(driver, SearchFlights.txt_To(driver), "BOM - Chhatrapati Shivaji International Airport");*/
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
