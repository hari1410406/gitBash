package com.appium.PomClass;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BigBasket {

	public BigBasket(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);		
	}
	
	
	@AndroidFindBy(id="com.bigbasket.mobileapp:id/text_welcome_message")
	private MobileElement WelcomePageTap;
	
	@AndroidFindBy(id="com.bigbasket.mobileapp:id/iv_drawer")
	private MobileElement ThreeDots;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Shop By Category']")
	private MobileElement ShopByCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Bakery, Cakes & Dairy']")
	private MobileElement BakeryClick;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Cookies, Rusk & Khari']")
	private MobileElement CookiesClick;
	
	@AndroidFindBy(className="android.widget.TextView")
	private List<MobileElement> CountOfItems;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']")
	private List<MobileElement> NamesOfItems;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtSalePrice']")
	private List<MobileElement> PriceOfItems;
	
	

	public void getWelcomePageTap() {
	WelcomePageTap.click();;
	}

	public void getThreeDots() {
		 ThreeDots.click();;
	}

	public void getShopByCategory() {
		 ShopByCategory.click();;
	}

	public void getBakeryClick() {
		 BakeryClick.click();;
	}

	public void getCookiesClick() {
		 CookiesClick.click();;
	}

	public List<MobileElement> getCountOfItems() {
		return CountOfItems;
	}

	public List<MobileElement> getNamesOfItems() {
		return NamesOfItems;
	}

	public List<MobileElement> getPriceOfItems() {
		return PriceOfItems;
	}
	


	
	

}
