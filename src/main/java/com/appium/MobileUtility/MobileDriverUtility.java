package com.appium.MobileUtility;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class MobileDriverUtility {
	
AndroidDriver<MobileElement> driver;
	
	public AndroidDriver<MobileElement> intializeAndroidDriver(URL url,DesiredCapabilities capabilities) {
		 return driver=new AndroidDriver<MobileElement>(url,capabilities);
	}
	
	/**
	 * this method is used install the app
	 * Should give app location as path
	 * @param path
	 */
	public void installApp(String path) {
		driver.installApp(path);
	}
	
	public void launchApp() {
		driver.launchApp();
	}
	
	public void closeApp() {
		driver.closeApp();
	}
	
	public void switchToAnotherApp(String appPackage,String appActivity) {
		driver.startActivity(appPackage, appActivity);
	}
	
	public void singletapOnElement(MobileElement element) {
		driver.tap(1, element, 1000);
	}
	public void singletapOnCoOrdinate(int x, int y) {
		driver.tap(1, x, y, 1000);
	}
	
	public void swipe(int start_x, int start_y, int end_x, int end_y ) {
		 driver.swipe(start_x, start_y, end_x, end_y, 1000);
	}
	
	public void scrollToElement(String an, String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
	
	public void implicitWait(long to) {
		driver.manage().timeouts().implicitlyWait(to,TimeUnit.SECONDS);
	}
	
}




/*public class MobileDriverUtility {
	
	private static AndroidDriver driver=null;
	
	public  static void scrollTillElement(AndroidDriver driver, String an, String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}

	
	public static void  openApplication(String url ) {
		driver.get(url);
	}
	
	public void swipeAction(int startx, int starty, int endx, int endy, int duration) {
		driver.swipe(startx, starty, endx, endy, duration);
	}
	
	*/
	

