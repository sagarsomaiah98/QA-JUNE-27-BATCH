package com.sauce.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Ready {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CONFIG\\config.properties");
		
		Properties prop=new Properties();
		
		prop.load(fs);
		
		String value=prop.getProperty("BROWSER");
		
		System.out.println(value);
		
	}

}
