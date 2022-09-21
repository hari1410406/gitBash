package com.appium.ApiDemos;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumStartServer {

	@Test
	public void startAppiumServer() throws MalformedURLException, InterruptedException {

	//	AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService();
	//	service.start();

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi note 9 pro max");
		dc.setCapability("noReset", true);

		dc.setCapability("appPackage", "com.android.camera");
		dc.setCapability("appActivity", ".Camera");

		URL url=new URL("http://localhost:4723/wd/hub");

		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		System.out.println(AndroidKeyCode.KEYCODE_BACK);
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		Thread.sleep(2000);
		driver.openNotifications();
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		
		driver.closeApp();
		//service.stop();


	}

}
