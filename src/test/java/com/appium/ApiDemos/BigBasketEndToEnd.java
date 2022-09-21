package com.appium.ApiDemos;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.appium.MobileUtility.BaseClass;
import com.appium.MobileUtility.MobileDriverUtility;
import com.appium.PomClass.BigBasket;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BigBasketEndToEnd extends BaseClass {
	
	public AndroidDriver driver;
	@Test
	public void bigBasket() throws MalformedURLException, InterruptedException {
	/*	DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 9 pro max");
		dc.setCapability(MobileCapabilityType.UDID, "bfc40e93");
		dc.setCapability("appPackage", "com.bigbasket.mobileapp");
		dc.setCapability("appActivity", ".activity.SplashActivity");*/
	//	URL url=new URL("http://localhost:4723/wd/hub");
	//	AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(url, dc);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileDriverUtility mobile=new MobileDriverUtility();
		BigBasket basket=new BigBasket(driver);
		mobile.implicitWait(10);
	//	TouchAction touch=new TouchAction(driver);
	//	touch.tap(530, 450)
		basket.getWelcomePageTap();
	//	driver.findElement(By.id("com.bigbasket.mobileapp:id/text_welcome_message")).click();
	//	Thread.sleep(2000);
	//	driver.tap(1, 530, 450, 500);
	/*	driver.findElement(By.id("com.bigbasket.mobileapp:id/text_choose_location")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@text='ONLY THIS TIME']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.bigbasket.mobileapp:id/btnUseThisLocation")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='1 lakh+ products at lowest prices']")).click();*/
		Thread.sleep(2000);
		basket.getThreeDots();
		//driver.findElement(By.id("com.bigbasket.mobileapp:id/iv_drawer")).click();
		basket.getShopByCategory();
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Shop By Category']")).click();
		basket.getBakeryClick();
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Bakery, Cakes & Dairy']")).click();
		//List<MobileElement> imagesnames = driver.findElements(By.xpath("//android.widget.ImageView[@content-desc='Product Image']"));
		//System.out.println(imagesnames.size());
		basket.getCookiesClick();
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Cookies, Rusk & Khari']")).click();
		List<MobileElement> namesOfCookies = basket.getCountOfItems();
	//	List<MobileElement> namesOfCookies = driver.findElements(By.className("android.widget.TextView"));
		System.out.println("Number Of cookie names"+namesOfCookies.size());
		Thread.sleep(2000);
		driver.swipe(542, 1545, 563, 840, 500);
		MobileDriverUtility m=new MobileDriverUtility();
	//	m.scrollTillElement(driver, "text", "Cookies - Atta Desi Ghee");
		List<MobileElement> names = basket.getNamesOfItems();
	//List<MobileElement> names = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']"));
	for(MobileElement hh:names) {
		System.out.println(hh.getText());
	}
	Thread.sleep(2000);
	List<MobileElement> price = basket.getPriceOfItems();
//	List<MobileElement> price = driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtSalePrice']"));
	
	for(MobileElement rupees:price) {
		System.out.println(rupees.getText());
	}
	for(int i=0, j=0; i<names.size() && j<price.size(); i++, j++ ) {
		Thread.sleep(2000);
		//driver.swipe(542, 1545, 563, 1545, 500);
	//	m.scrollTillElement(driver, "text", "Cookies - Atta Desi Ghee");
		System.out.println(names.get(i).getText()+"======>"+price.get(j).getText());
	
		//String bakeryPrice = m.convertStringToLong(price.get(i).getText(), "₹");
		//Double.parseDouble(bakeryPrice);
		//String prices="₹60";
		String[] newPrice = splitString(price.get(i).getText(), "₹");
		double newPrice1 = Double.parseDouble(newPrice[1]);
		if(newPrice1>=100) {
			System.out.println(names.get(i).getText()+"===>"+newPrice1);
			
		}
			
	}	}
	
	public String[] splitString(String value,String strategy) {
		return value.split(strategy);
		
	}
	
	
	}

