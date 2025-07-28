package com.saucedemo.pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	
	WebDriver driver;
	
	public LogoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By menues = By.xpath("//button[@id='react-burger-menu-btn']");
	By logout = By.xpath("//a[@id='logout_sidebar_link']");
	
	//Action mathod 
	
	public void clickMenuesButton()
	{
		driver.findElement(menues).click();
	}
	
	public void clickLogoutButton()
	{
		driver.findElement(logout).click();
	}
	
	public void screenshot() throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\soucedemo\\logoutpage\\screenshot.png");
		FileUtils.copyFile(src, dest);
		
	}

}
