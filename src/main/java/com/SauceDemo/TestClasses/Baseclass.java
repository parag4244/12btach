package com.SauceDemo.TestClasses;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPagePMOClass;


public class Baseclass {
	public WebDriver driver;
	
	Logger log = Logger.getLogger("Sauucedemo1");
	
	@BeforeMethod
	public void baseclass()
	{
	 
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    driver = new ChromeDriver();
    log.info("browser open");
	PropertyConfigurator.configure("log4j.properties");
	 
    driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/"); 
	log.info("Url open");
	
	LoginPagePMOClass a1 = new LoginPagePMOClass(driver);
	a1.sendusername();
	log.info("Enter username");
	a1.sendpassword();
	log.info("Enter password");
	a1.clicklogin();
    log.info("Click on login button");
	}
	
	
	@AfterMethod
	   public void teardown()
	   {
		   
		driver.close();
		log.info("End of programme");
	   }
}
