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

import com.makemytrip.objectrepository.AddMeals;
import com.makemytrip.objectrepository.CreditCardInformation;
import com.makemytrip.objectrepository.PaymentMode;
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
		press(TravellerDetails.btn_Done(driver));
		setValue(TravellerDetails.txt_Email(driver), "abc@gmail.com");
		hideKeyBoard(driver);
		setValue(TravellerDetails.txt_PhoneNumber(driver), "9876543210");
		hideKeyBoard(driver);
		
		//click on Book Flight button
		press(TravellerDetails.btn_BookFlight(driver));
		
		//click on remove insurance button in popup
		press(TravellerDetails.btn_RemoveInsurance(driver));
		
		//handling for fare increase popup
		if(TravellerDetails.btn_FareIncrease_Continue(driver).isDisplayed()) {
			press(TravellerDetails.btn_FareIncrease_Continue(driver));
		}
		
		//click on skip button
		press(AddMeals.btn_Skip(driver));
		
		//click on credit card option
		press(PaymentMode.btn_CreditCard(driver));
		
		//Enter credit card information
		setValue(CreditCardInformation.txt_CardNumber(driver), "5555555555554444");
		setValue(CreditCardInformation.txt_NameonCard(driver), "Abc");
		
		press(CreditCardInformation.lst_ExpiryMonth(driver));
		press(CreditCardInformation.lst_Value(driver, "January (01)"));
		
		press(CreditCardInformation.lst_ExpiryYear(driver));
		press(CreditCardInformation.lst_Value(driver, "2020"));
		
		setValue(CreditCardInformation.txt_Cvv(driver), "183");
		hideKeyBoard(driver);
		
		//Enter billing details
		if(CreditCardInformation.lst_SelectCountry(driver).isDisplayed()) {
			press(CreditCardInformation.lst_SelectCountry(driver));
			press(CreditCardInformation.lst_Value(driver, "India"));
			
			setValue(CreditCardInformation.txt_State(driver), "UP");
			hideKeyBoard(driver);
			setValue(CreditCardInformation.txt_City(driver), "noida");
			hideKeyBoard(driver);
			setValue(CreditCardInformation.txt_BillingAddress(driver), "sector 65");
			hideKeyBoard(driver);
			setValue(CreditCardInformation.txt_ZipCode(driver), "201301");
			hideKeyBoard(driver);
		}
		
		press(CreditCardInformation.btn_Continue(driver));
		Thread.sleep(20000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
