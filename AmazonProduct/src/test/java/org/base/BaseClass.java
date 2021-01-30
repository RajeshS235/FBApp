package org.base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class BaseClass  {
	ReadData read = new ReadData();
	public String chro = read.getChrome();
	public String baseUrl = read.getUrl();
	public String fire = read.getFireFox();
	public String user = read.getUsername();
	public String pass =  read.getPassword();
	
	public static Logger logger;
	
	
	public static WebDriver driver;


	@BeforeClass
public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		logger = Logger.getLogger("RollingFileAppender");
		PropertyConfigurator.configure("./log4j.properties");
		
	}
	
@AfterClass
public void tearDown() {
	
}
	
	
}
