package com.janbask.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream f= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CONFIG\\config.properties");
		
		Properties p = new Properties();
		
		p.load(f);
		
	System.out.println(p.getProperty("BROWSER"));
		
		//System.out.println(System.getProperty("user.dir"));
		

	}

}
