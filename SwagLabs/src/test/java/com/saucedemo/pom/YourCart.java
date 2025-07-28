package com.saucedemo.pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class YourCart {
	
	WebDriver driver;
	
	public YourCart (WebDriver driver)
	{
		this.driver =driver;
	}
	
	By checkoutButton = By.xpath("//button[@id='checkout']");
	By firstname = By.xpath("//input[@id='first-name']");
	By lastname = By.xpath("//input[@id='last-name']");
	By zipCode = By.xpath("//input[@id='postal-code']");
	By continueButton = By.xpath("//input[@id='continue']");
	
	By description = By.xpath("//*[@id=\"contents_wrapper\"]");
	
	By finish = By.xpath("//button[@id='finish']");
	By backHomeButton = By.xpath("//button[@id='back-to-products']");
	
	//Action method
	
	public void clickcheckoutButton()
	{
		driver.findElement(checkoutButton).click();
	}
	
	public void enterfirstname(String Fname)
	{
		driver.findElement(firstname).sendKeys(Fname);;
	}
	
	public void enterlastname(String lname)
	{
		driver.findElement(lastname).sendKeys(lname);
	}
	
	public void enterzipcode(String aaa)
	{
		driver.findElement(zipCode).sendKeys(aaa);
	}
	
	public void ClickcontinueButton()
	{
		driver.findElement(continueButton).click();
	}

	public void description()
	{
		String element =driver.findElement(description).getText();
		System.out.println(element);
	}
	
	public void screenshot1() throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\soucedemo\\yourcart\\screenshot1.png");
		FileUtils.copyFile(src, dest);
		
	}
	
	public void finishButton ()
	{
		driver.findElement(finish).click();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
		String actualr = element.getText();
		System.out.println(actualr);
		String expectedr = "Thank you for your order!";
		Assert.assertEquals("Thank you for your order!", expectedr, actualr);
		
	}
	
	public void screenshot() throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\soucedemo\\yourcart\\screenshot.png");
		FileUtils.copyFile(src, dest);
		
	}
	
	public void clickbackhomeButton()
	{
		driver.findElement(backHomeButton).click();
	}
}
