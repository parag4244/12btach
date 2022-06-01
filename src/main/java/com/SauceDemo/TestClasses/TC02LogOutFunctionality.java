package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePMOClass;
import com.SauceDemo.Utility.ScreenshotClass;


import okio.Timeout;
@Listeners(com.SauceDemo.Utility.Listener.class)
public class TC02LogOutFunctionality extends Baseclass
{
	
	@Test(priority =3)
	public void logout() throws IOException
    {
	HomePagePMOClass a2 = new HomePagePMOClass(driver);
    a2.Clickmenu();
     a2.ClickLogout();
	String expectedurl ="https://www.saucedemo.com/";
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	ScreenshotClass.takesScreenshot(driver);
	String actualurl = driver.getCurrentUrl();   
	Assert.assertEquals(actualurl, expectedurl);
	
	}
}

