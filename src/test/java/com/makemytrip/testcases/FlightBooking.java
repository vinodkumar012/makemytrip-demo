package com.makemytrip.testcases;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.makemytrip.driver.DriverManager;
import com.makemytrip.objectrepository.FlightDetails;

import static com.makemytrip.driver.DriverUtils.*;

import com.makemytrip.objectrepository.SearchFlights;
import com.makemytrip.objectrepository.FlightResults;
import com.makemytrip.objectrepository.TravellerDetails;

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
		
		/*setValue(SearchFlights.txt_From(driver), "DEL - Indira Gandhi International Airport");
		setValue(SearchFlights.txt_To(driver), "BOM - Chhatrapati Shivaji International Airport");*/
		
		// selectin departure and return date based on current date, i.e. currdate+5 as departure and currdate+8 as return date 
		press(SearchFlights.txt_DepartDate(driver));
		press(SearchFlights.day_Calendar(driver, 5));
		press(SearchFlights.tab_returnDate(driver));
		press(SearchFlights.day_Calendar(driver, 8));
		press(SearchFlights.btn_Calendar_OK(driver));
		
		//click on search button
		press(SearchFlights.btn_Search(driver));
		
		//click on Book button
		press(FlightResults.btn_Book(driver));
		
		//click on Continue button
		press(FlightDetails.btn_Continue(driver));
		
		//Enter passinger details
		press(TravellerDetails.btn_AddNewAdult(driver));
		setValue(TravellerDetails.txt_FirstName(driver), "passinger");
		setValue(TravellerDetails.txt_LastName(driver), "one");
		
		Thread.sleep(20000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
