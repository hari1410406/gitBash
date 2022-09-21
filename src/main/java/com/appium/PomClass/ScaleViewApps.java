package com.appium.PomClass;

import java.lang.reflect.Field;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ScaleViewApps {
	
	@AndroidFindBy(id="com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")
	private MobileElement basicFeaturesClick;
	
	@AndroidFindBy(id="com.davemorrissey.labs.subscaleview.sample:id/imageView")
	private MobileElement imageClick;
	
	
public ScaleViewApps(AndroidDriver driver) {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
}


public void getBasicFeaturesClick() {
 basicFeaturesClick.click();;
}


public MobileElement getImageClick() {
	 return imageClick;
}	



}
