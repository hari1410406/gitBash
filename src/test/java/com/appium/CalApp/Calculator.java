package com.appium.CalApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	
	@Test
	public void calculatorActions() throws MalformedURLException {
		DesiredCapabilities desiredCap=new DesiredCapabilities();
		desiredCap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredCap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredCap.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		desiredCap.setCapability("appPackage", "com.miui.calculator");
		desiredCap.setCapability("appActivity", ".cal.AllInOneCalculatorActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, desiredCap);
		driver.findElement(By.id("com.miui.calculator:id/btn_2_s")).click();
		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
		driver.findElement(By.id("com.miui.calculator:id/btn_5_s")).click();
		driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
		String value = driver.findElement(By.id("com.miui.calculator:id/listView")).getText();
		System.out.println(value);
		
	}

}
