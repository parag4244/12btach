package com.SauceDemo.POMClasses;





import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePMOClass {

	private WebDriver driver;
	private Select s;
	Logger log = Logger.getLogger("Sauucedemo1");
	
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement BackPack;
	
	public void clickBackpackcart()
	{
		BackPack.click();
	}
	
	@FindBy(xpath="//button[@id='//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement BikeLight;
	
	public void clickBikeLightcart()
	{
		BikeLight.click();
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement Tshirt;
	
	public void clickTshirt()
	{
		Tshirt.click();
	}
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement FleeceJacket;
	
	public void clickFleeceJacket()
	{
		FleeceJacket.click();
	}
	@FindBy(xpath ="//select[@class='product_sort_container']")
	private WebElement Filter;
	
	public void ClickFilter()
	{
		Filter.click();
	}
	
	@FindBy(xpath ="//button[@id ='react-burger-menu-btn']")
	private WebElement menu;
	
	public void Clickmenu()
	{
		menu.click();
	}
	@FindBy(xpath = "//a[@id = 'logout_sidebar_link']")
	private WebElement Logout;
	
	public void ClickLogout()
	{
		Logout.click();
		
	}
	
	@FindBy(xpath ="//span[text() ='1']")
	private WebElement cart;
	
	public String ClickCart()
	{
		String totalproduct = cart.getText();
		return totalproduct;
	}
	
	
	@FindBy(xpath ="//select[@class ='product_sort_container']")
	private WebElement filterButton;
	
	public void ClickFilterButton()
	{
		filterButton.click();
		PropertyConfigurator.configure("log4j.properties");
		log.info("Click on filter button");
		s.selectByValue("lohi");
		log.info("price low to high select");
	}
	
	public HomePagePMOClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		s  = new Select(filterButton);
	}
	
	

}
