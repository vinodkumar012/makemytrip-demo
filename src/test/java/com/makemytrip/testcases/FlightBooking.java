package com.makemytrip.testcases;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.makemytrip.driver.DriverManager;
import static com.makemytrip.driver.DriverUtils.*;
import static com.makemytrip.objectrepository.SearchFlights.*;

public class FlightBooking {
	private AppiumDriver driver;
	
	@Parameters({ "platformName", "browserName", "version", "appPackage", "appActivity", "deviceName", "apkFileName", "nodeURL" })
	@BeforeClass
	public void setUp(String platformName, String browserName, String version, String appPackage, String appActivity, String deviceName, String apkFileName, String nodeURL) throws MalformedURLException{
		driver = DriverManager.getDriver(platformName, browserName, version, appPackage, appActivity, deviceName, apkFileName, nodeURL);
	}
	
	@Test
	public void flightSearch_Search_Book_Continue_EnterDetails_BookFlight_RemoveInsurance_CreditCard_EnterCCDetails_Verify_Continue() throws InterruptedException {
		//commenting below lines as application is hanging while entering values in departure and arrival cities
		
		/*setValue(txt_From(driver), "DEL - Indira Gandhi International Airport");
		setValue(txt_To(driver), "BOM - Chhatrapati Shivaji International Airport");*/
		
		// selectin departure and return date based on current date, i.e. currdate+5 as departure and currdate+8 as return date 
		press(txt_DepartDate(driver));
		press(day_Calendar(driver, 5));
		press(day_Calendar(driver, 8));
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
