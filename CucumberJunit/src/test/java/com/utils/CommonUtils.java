package com.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.base.BaseClass;
import com.contantss.ConstantsProps;

public class CommonUtils extends BaseClass {

	

	public static void loadProperties() throws IOException {
		

	/*	FileReader reader = new FileReader("config.properties");
		Properties property = new Properties();
		property.load(reader);
		ConstantsProps.APP_URL = property.getProperty("url");
		ConstantsProps.APP_USERNAME = property.getProperty("username");
		
	*/
		
		valueFromProperty("url");
		valueFromProperty("username");

	}

}
