package com.appium.MyApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallingApp {
	
	@Test
	public void installApp() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "redmi note 9 pro max");
		dc.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\avula\\Downloads\\ApiDemos-debug.apk");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur, dc);
		//driver.installApp("‪‪C:\\Users\\avula\\Downloads\\General-Store.apk");
		//driver.launchApp();
		
	}

}
