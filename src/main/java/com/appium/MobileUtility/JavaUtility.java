package com.appium.MobileUtility;

public class JavaUtility {
	
	public String[] splitString(String value,String strategy) {
		return value.split(strategy);
		
	}
	public double convertStringToLong( String value, String string) {
		return Double.parseDouble(value);
	}


}
