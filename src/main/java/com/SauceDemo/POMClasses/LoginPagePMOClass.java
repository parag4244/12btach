package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePMOClass {

	
	private WebDriver driver;
	
	@FindBy(xpath ="//input[@id='user-name']")
	private WebElement username;
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
		
	}

	@FindBy(xpath ="//input[@id='password']")
	private WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	 
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login;
	
	public void clicklogin()
	{
		login.click();
	}
	public LoginPagePMOClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}

	
}
