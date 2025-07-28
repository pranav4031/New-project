package com.saucedemo.TestCases;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.saucedemo.pom.LoginPage1;
import com.saucedemo.pom.LogoutPage;
import com.saucedemo.pom.ProductPage;
import com.saucedemo.pom.YourCart;

public class Testcase {
	
	
	WebDriver driver;
	
	
	@BeforeTest
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	}
	
	@Test (priority = 1)
	public void firstpage() throws InterruptedException, IOException
	{
		LoginPage1 loginpage = new LoginPage1(driver);
		loginpage.enterUsername("standard_user");
		loginpage.enterPassword("secret_sauce");
		loginpage.ClickloginButton1();
		loginpage.screenshot();
		
	}
	
	@Test (priority = 2)
	public void productspage() throws IOException
	{
		ProductPage productpage = new ProductPage(driver);
		productpage.backpackAdd();
		productpage.bikelight();
		productpage.tshirt();
		productpage.jacket();
		productpage.onesie();
		productpage.redTshirt();
		productpage.backpackremove();
		productpage.tshirtremove();
		productpage.Clickcart();
		productpage.screenshot();
		
	}
	
	@Test (priority = 3)
	public void cartpage() throws InterruptedException, IOException
	{
		
		YourCart yourcart = new YourCart(driver);
		yourcart.clickcheckoutButton();
		yourcart.enterfirstname("ABCD");
		yourcart.enterlastname("DDDD");
		yourcart.enterzipcode("123456");
		yourcart.ClickcontinueButton();
		yourcart.description();
		yourcart.screenshot1();
		yourcart.finishButton();
		yourcart.screenshot();
		yourcart.clickbackhomeButton();
	}
	
	@Test (priority = 4)
	public void logoutb() throws IOException
	{
		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.clickMenuesButton();
		logoutpage.clickLogoutButton();
		logoutpage.screenshot();
	}
	
	@AfterTest
	public void closebrowser() throws InterruptedException
	{
		driver.close();
	}
	

}
