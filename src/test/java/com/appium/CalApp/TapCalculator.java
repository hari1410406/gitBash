package com.appium.CalApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TapCalculator {
	
	
	
	@Test
	public void calculatorTapActions() throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCap=new DesiredCapabilities();
		desiredCap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredCap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		desiredCap.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		desiredCap.setCapability("appPackage", "com.miui.calculator");
		desiredCap.setCapability("appActivity", ".cal.AllInOneCalculatorActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, desiredCap);
		Thread.sleep(2000);
		WebElement two = driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
		driver.tap(1, two, 500);
		WebElement plus = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		driver.tap(1, 963, 1943, 500);
		WebElement five = driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
		driver.tap(1, five, 500);
		WebElement equalsTo = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		driver.tap(1, equalsTo, 500);
		Thread.sleep(2000);
		String value = driver.findElement(By.id("com.miui.calculator:id/listView")).getText();
		System.out.println(value);
		
		
	}

}
