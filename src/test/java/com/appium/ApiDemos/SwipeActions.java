package com.appium.ApiDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeActions {
	
	@Test
	public void swipe() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur, dc);
		driver.swipe(571, 467, 559, 2006, 500);
		driver.swipe(88, 1021, 951, 1010, 500);
		Dimension value = driver.manage().window().getSize();
		int height = value.getHeight();
		int width = value.getWidth();
		driver.swipe(width, height/2, width, height/2, 500);
		driver.swipe(width/2, height, width/2, height, 500);
		System.out.println("height of the phone is"+height);
		System.out.println("height of the phone is"+width);
		//vertical swipe
		driver.swipe(width/2, (int)(height*0.25), width/2, (int)(height*0.80), 1000);
		driver.swipe((int)(width*0.1), (int)(height*0.2),(int) (width*0.1),(int)(height*0.8), 500);
		driver.swipe((int)(width*0.5), (int)(height*0.2),(int) (width*0.5),(int)(height*0.8), 500);
		driver.swipe((int)(width*0.9), (int)(height*0.2),(int) (width*0.9),(int)(height*0.8), 500);
		
		//horizantal swipe
		driver.swipe((int)(width*0.25), height/2, (int)(width*0.80), height/2, 1000);
		driver.swipe((int)(width*0.1), (int)(height*0.8),(int) (width*0.9),(int)(height*0.8), 500);
		driver.swipe((int)(width*0.1), (int)(height*0.2),(int) (width*0.9),(int)(height*0.2), 500);
		driver.swipe((int)(width*0.1), (int)(height*0.5),(int) (width*0.9),(int)(height*0.5), 500);
		
	}

}
