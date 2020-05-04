package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		//we can write it into two ways.
		this.driver =ldriver;
	}
	
	@FindBy(name="username") WebElement uname;
	@FindBy(name="password") WebElement pass;
	@FindBy(xpath="//input[@value='Login']") WebElement loginButton;
	
	public void loginToCRM(String userNameApplication,String passwordApplication)
	{
		uname.sendKeys(userNameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
	}
	

}
