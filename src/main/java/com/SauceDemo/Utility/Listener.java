package com.SauceDemo.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;

import org.testng.ITestResult;

import com.SauceDemo.TestClasses.Baseclass;

public class Listener implements ITestListener
{
     WebDriver driver;
	public void onTestStart(ITestResult result)
	{
		System.out.println("sanity testing is started");
		this.driver = ((Baseclass)result.getInstance()).driver;
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/img.jpg");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ScreenShot is taken");
	}
	
	public void onTestFinish(ITestResult result)
	{
		System.out.println("Test is finish");
	}
	
	
}
