package com.appium.ApiDemos;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GeneralStoreProgram {
	
	@Test
	public void generalStore() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(ur, dc);
		driver.launchApp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("Hari");
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		String expected="$ 280.97";
		String actual= driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		System.out.println("compared sucessfully");
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Set<String> windows = driver.getContextHandles();
		for(String window:windows) {
			System.out.println("Active windows"+window);
			driver.context("WEBVIEW_com.androidsample.generalstore");
		}
	//	driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.context((String) windows.toArray()[1]);
		//driver.context("WEBVIEW_com.androidsample.generalstore");
		//driver.findElement(By.xpath("//android.widget.Button[@text='Google Search']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Google offered in:']")).getText();
		//driver.context("NATIVE_APP");
	}

}
