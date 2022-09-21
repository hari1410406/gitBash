package com.appium.ApiDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppMethods {
	
    @Test
	public void appMethods() throws MalformedURLException {
    	DesiredCapabilities des=new DesiredCapabilities();
    	des.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    	des.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
    	des.setCapability(MobileCapabilityType.DEVICE_NAME, "redmi note 9 pro max");
    	des.setCapability(MobileCapabilityType.UDID, "bfc40e93");
    	des.setCapability("apppackage", "io.appium.android.apis");
    	des.setCapability("appActivity", ".ApiDemos");
    	URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(ur, des);
		
	

		
	}

}
