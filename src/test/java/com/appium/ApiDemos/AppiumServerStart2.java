package com.appium.ApiDemos;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.appium.PomClass.ScaleViewApps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumServerStart2 {
	
	@Test
	public void startServerMethod2() throws MalformedURLException, InterruptedException {
		
	/*	AppiumDriverLocalService server=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.usingPort(4723)
				.withLogFile(new File("C:\eclipseTYSS\SELENIUM WORKSPACE\Appium36/Logs.txt")));
		
		server.start();*/
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi note 9 pro max");
		dc.setCapability("noReset", true);

		dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appActivity", ".MainActivity");

		URL url=new URL("http://localhost:4723/wd/hub");

		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ScaleViewApps scale=new ScaleViewApps(driver);
	//	driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
	//	driver.findElement(By.id("android:id/button1")).click();
	//	driver.findElement(By.id( "com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
		Thread.sleep(3000);
	//	WebElement img = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
       scale.getBasicFeaturesClick();
      MobileElement img = scale.getImageClick();
		driver.zoom(img);
		Thread.sleep(5000);
		driver.pinch(img);
	}

}
