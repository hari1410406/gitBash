package com.appium.MobileUtility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.appium.PomClass.BigBasket;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	AppiumDriverLocalService service;
	AndroidDriver driver;
	PropertyFileUtiluity fileutility;
	
	@BeforeSuite
	public void database() {
		System.out.println("open the DaTABASE");
		
	}
	
/*	@BeforeClass
	public void startServer() {
	 service= AppiumDriverLocalService.buildDefaultService();
		service.start();
	}*/
	
	@BeforeMethod
	public void openApp() throws MalformedURLException {
		
		 fileutility=new PropertyFileUtiluity();
		fileutility.initializePropertyFile(IPathConstants.PropertyFilePath);
		
		String platFormName = fileutility.getDataFromProperty("platformName");
		String platFormVersion = fileutility.getDataFromProperty("platformVersion");
		String deviceID = fileutility.getDataFromProperty("UDID");
     	String apppacKage = fileutility.getDataFromProperty("appPackage");
     	String appActivity = fileutility.getDataFromProperty("appActivity");
     	
     	DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platFormName);
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, platFormVersion);
		dc.setCapability(MobileCapabilityType.UDID,  deviceID);
		dc.setCapability("appPackage",apppacKage );
		dc.setCapability("appActivity", appActivity );
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur, dc);
		
		 

	}
	
	@AfterMethod
	public void closeApp() {
		driver.closeApp();
	}
	
/*	@AfterClass
	public void teardownServer() {
		service.stop();*/
//	}
	
	@AfterSuite
	public void database1() {
		System.out.println("close the database");
	}

}
