package com.appium.ApiDemos;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemos {
	
	@Test
	public void apiDemosApp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(ur, dc);
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")).click();
		driver.findElement(By.id( "io.appium.android.apis:id/edit")).sendKeys("Hari");
		driver.findElement(By.id( "io.appium.android.apis:id/check1")).click();
		driver.findElement(By.id(  "io.appium.android.apis:id/check2")).click();
		driver.findElement(By.id( "io.appium.android.apis:id/radio1")).click();
		driver.findElement(By.id(  "io.appium.android.apis:id/radio2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/star")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle2")).click();
		driver.findElement(By.id( "android:id/text1")).click();
		driver.hideKeyboard();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Jupiter']")).click();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		List<WebElement> values = driver.findElements(By.className("android.widget.CheckedTextView"));
		for(WebElement allPlanets:values) {
			System.out.println(allPlanets.getText());
		}
		
		
		
	}

}
