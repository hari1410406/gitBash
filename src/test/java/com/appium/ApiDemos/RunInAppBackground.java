package com.appium.ApiDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class RunInAppBackground {
	
	@Test
	public void apiDemosInBackground() throws MalformedURLException {
		DesiredCapabilities desCap=new DesiredCapabilities();
		desCap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desCap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desCap.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		desCap.setCapability("appPackage", "io.appium.android.apis");
		desCap.setCapability("appActivity", ".ApiDemos");
		URL url =new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, desCap);
		driver.runAppInBackground(5);
		
		
	}

}
