package com.appium.App3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallTouchScreenApp {
	
	@Test
	public void installTouchSccreenTest() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "redmi note 9 pro max");
		dc.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\avula\\Downloads\\Touch Screen Test_v1.7.14_apkpure.com.apk");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur, dc);
		//driver.installApp("‪‪C:\\Users\\avula\\Downloads\\General-Store.apk");
		//driver.launchApp();

		
	}

}
