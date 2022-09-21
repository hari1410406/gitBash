package com.appium.Browserstack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowserstackApiDemos {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
    	DesiredCapabilities caps = new DesiredCapabilities();
    	
    	// Set your access credentials
    	caps.setCapability("browserstack.user", "avulaharish_a3hSQq");
    	caps.setCapability("browserstack.key", "DZ3MoTwfDWut7m3hfGVx");
    	
    	// Set URL of the application under test
    	caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
    	
    	// Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");
        
    	// Set other BrowserStack capabilities
    	caps.setCapability("project", "First Java Project");
    	caps.setCapability("build", "browserstack-build-1");
    	caps.setCapability("name", "first_test");
       
    	
    	// Initialise the remote Webdriver using BrowserStack remote URL
    	// and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
        		new URL("http://hub.browserstack.com/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("Hari");
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(10);
		
		
        
        
	}

}
