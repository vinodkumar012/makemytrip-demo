package com.makemytrip.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverManager {
	
	public static AppiumDriver getDriver(String platformName, String browserName, String version, String appPackage, String appActivity, String deviceName, String apkFileName, String nodeURL) throws MalformedURLException {
		DesiredCapabilities androidCapabilities = new DesiredCapabilities();
		androidCapabilities.setCapability("platformName", platformName);
		androidCapabilities.setCapability(CapabilityType.BROWSER_NAME, browserName);
		androidCapabilities.setCapability(CapabilityType.VERSION, version);
		androidCapabilities.setCapability("appPackage", appPackage);
		androidCapabilities.setCapability("appActivity", appActivity);
		androidCapabilities.setCapability("deviceName", deviceName);
		File baseApkPath = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator);
		androidCapabilities.setCapability("app", new File(baseApkPath + apkFileName).getAbsolutePath());
		return new AndroidDriver(new URL(nodeURL),androidCapabilities);
	}

}
