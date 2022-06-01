package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePMOClass;
import com.SauceDemo.POMClasses.LoginPagePMOClass;
import com.SauceDemo.Utility.ScreenshotClass;
@Listeners(com.SauceDemo.Utility.Listener.class)
public class TCO3AddCart extends Baseclass
{

	@Test(priority =1)
	public void AddCartfunctionality() throws IOException 
	{
	HomePagePMOClass a2 = new HomePagePMOClass(driver);
          a2.clickBackpackcart();
		String actual = "1";
		String expected =a2.ClickCart();
		
		Assert.assertEquals(actual, expected);
		ScreenshotClass.takesScreenshot(driver);
		log.info("one product add in cart");
		
}
}
