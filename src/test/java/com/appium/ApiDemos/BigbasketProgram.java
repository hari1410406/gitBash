package com.appium.ApiDemos;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BigbasketProgram {
	@Test
	public void bigBasket() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 9 pro max");
		dc.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		dc.setCapability("appPackage", "in.swiggy.android");
		dc.setCapability("appActivity", ".activities.HomeActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
	//	driver.findElement(By.id( "com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		//List shopping = driver.findElements(By.className( "android.widget.ImageView"));
	//	driver.swipe(525, 1923, 500, 922, 500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("in.swiggy.android:id/tv_primary_cta")).click();
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='CONFIRM LOCATION']")).click();
		Thread.sleep(3000);
		driver.findElementByAccessibilityId( "explore instamart, grab fifty percent off welcome to the big party sale!").click();
		driver.swipe(721, 1430, 534, 1426, 500);
		driver.findElement(By.xpath("//android.widget.Button[@text='category Biscuits & Cakes, tap to select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@bounds='[539,1545][1080,2168]']")).click();
		TouchAction touch=new TouchAction(driver);
		touch.press(680, 1547).release().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Sunfeast Dark Fantasy Choco Fills Biscuits cost 109 rupee, offer 36% OFF, tap to add to cart']")).click();
	//	driver.findElement(By.xpath("//android.widget.Button[@text='Sunfeast Dark Fantasy Choco Fills Biscuits cost 109 rupee, offer 36% OFF, tap to add to cart 1 quantity added to cart, Tap to increase quantity']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Cart total is 109 rupee. Item quantity is 1. Tap to go to cart']")).click();
		String billDetails = driver.findElement(By.id("bill_details")).getText();
		System.out.println(billDetails);
		
	}

}