package com.makemytrip.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverManager {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DriverManager.class);
	
	public static AppiumDriver getDriver(String platformName, String browserName, String version, String appPackage, String appActivity, String deviceName, String apkFileName, String nodeURL) throws MalformedURLException {
		LOGGER.info("Going to initiate driver");
		DesiredCapabilities androidCapabilities = new DesiredCapabilities();
		androidCapabilities.setCapability("platformName", platformName);
		androidCapabilities.setCapability(CapabilityType.BROWSER_NAME, browserName);
		androidCapabilities.setCapability(CapabilityType.VERSION, version);
		androidCapabilities.setCapability("appPackage", appPackage);
		androidCapabilities.setCapability("appActivity", appActivity);
		androidCapabilities.setCapability("deviceName", deviceName);
		File baseApkPath = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources");
		androidCapabilities.setCapability("app", new File(baseApkPath + File.separator + apkFileName).getAbsolutePath());
		AppiumDriver driver = new AndroidDriver(new URL(nodeURL),androidCapabilities);
		LOGGER.info("Initiated driver with capabilities as : " + androidCapabilities);
		return driver;
	}

}
