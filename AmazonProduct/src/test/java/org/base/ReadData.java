package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadData {
	
	public Properties properties;
	
	public static WebDriver driver;
	
	public ReadData() {
	try {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\AmazonProduct\\config.properties");
		FileInputStream fil = new FileInputStream(f);
		properties = new Properties();
		properties.load(fil);
	}
	
	catch(Exception e) {
		
		System.out.println(e.getMessage());
		
	}
	}
	
	public String getChrome() {
		String chrome = properties.getProperty("Chromelocation");
		return chrome;
	}
	
	public String getFireFox() {
		String fire = properties.getProperty("Firefox");
		return fire;
	}
	
	public String getUrl() {
		String urls = properties.getProperty("url");
		return urls;
	}
	
	public String getUsername() {
		String username = properties.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = properties.getProperty("password");
		return password;
		
	}
	
}
