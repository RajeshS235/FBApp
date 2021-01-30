package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IphonePojo extends BaseClass {
	
	
	
	public IphonePojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement username;

	
	@FindBy(id="pass")
	private WebElement password;
	
	
	@FindBy(id="u_0_b")
	private static WebElement clickBtn;


	public void setUsername(String user) {
		username.sendKeys(user);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}


	public static void setClickBtn() {
	clickBtn.click();
			
	}


}
