package com.saucedemo.pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import com.saucedemo.TestCases.WebElement;

public class LoginPage1 {
	
	
	WebDriver driver;
	
	public LoginPage1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By UserName = By.id("user-name");
	By password = By.xpath("//*[@id=\"password\"]");
	By LoginButton = By.id("login-button");
	
	
	//Action Methods :
	
	public void enterUsername(String uname) 
	{
		driver.findElement(UserName).sendKeys(uname);
	}
	
	public void enterPassword(String passWord)
	{
		driver.findElement(password).sendKeys(passWord);
	}
	
	public void ClickloginButton1() throws InterruptedException
	{
		driver.findElement(LoginButton).click();
		Thread.sleep(4000);
		
	}
	
	public void screenshot() throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\soucedemo\\Loginpage1\\screenshot.png");
		FileUtils.copyFile(src, dest);
		
	}
	
	
	
}
