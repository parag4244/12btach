package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePMOClass;
import com.SauceDemo.POMClasses.LoginPagePMOClass;
import com.SauceDemo.Utility.ScreenshotClass;
@Listeners(com.SauceDemo.Utility.Listener.class)
public class TC1LoginFunctionality extends Baseclass {

  

	 @Test(priority =4)
	 public void loginFunctionalitytest() throws IOException 
	 {
		String Expected = "Swag Labs";
		String Actual = driver.getTitle();
		
		
		Assert.assertEquals(Expected, Actual);
	 }
	  
	 
	
}
