package com.appium.ApiDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class OrientationApiDemos {

	@Test
	public void apiDemosOrientation() throws MalformedURLException {
		DesiredCapabilities desiredCap=new DesiredCapabilities();
		desiredCap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredCap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredCap.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		desiredCap.setCapability("appPackage", "io.appium.android.apis");
		desiredCap.setCapability("appActivity", ".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, desiredCap);
		ScreenOrientation orient = driver.getOrientation();
		driver.rotate( orient.LANDSCAPE);
		driver.rotate(orient.PORTRAIT);
		

	}

}
