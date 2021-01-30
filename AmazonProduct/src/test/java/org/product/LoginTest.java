package org.product;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.IphonePojo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	
	
	@Test(priority=1)
	public void test01() {
		driver.get(baseUrl);
		logger.info("Url is Launched");
	}

	@Test(priority=2)
	public void validateUsername() {
		IphonePojo l = new IphonePojo();
		l.setUsername(user);
		
		logger.info("Username is sent");
	}
	
	@Test(priority=3)
	public void validatePassword() {
		IphonePojo l = new IphonePojo();
		l.setPassword(passes);
		
		logger.info("Password is entered");
		
		l.setClickBtn();
		
		logger.info("Clicked Ok option");
	}
	@Test(priority=4)
	public void errorTextValidate() {
		WebElement error = driver.findElement(By.className("_9ay7"));
		String text = error.getText();
		System.out.println(text);
		if(text.equals("The email address that you've entered doesn't match any account. Sign up for an account.")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
			logger.info("Test Fail");
		}
	}	
	
}
