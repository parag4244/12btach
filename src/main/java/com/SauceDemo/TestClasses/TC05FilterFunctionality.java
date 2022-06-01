package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePMOClass;
import com.SauceDemo.Utility.ScreenshotClass;
@Listeners(com.SauceDemo.Utility.Listener.class)
public class TC05FilterFunctionality extends Baseclass
{

	@Test(priority =2)
	public void filterFunctionality() throws IOException
	{
		
		
		HomePagePMOClass a6 =new HomePagePMOClass(driver);
		
		a6.ClickFilterButton();
		log.info("Click on filter");
	}
	
	
	
	
}
