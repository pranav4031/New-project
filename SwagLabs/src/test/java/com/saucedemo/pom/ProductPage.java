package com.saucedemo.pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	WebDriver driver;
	
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//Add to cart
	By backPackAddtocart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By bikeLightAddtocart = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	By tshirtAddtocart = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	By jacketAddtocart = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
	By onesieAddtocart = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
	By redTshirtAddtocart = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
	
	//remove from cart
	By backpackremovefromcart = By.xpath("//button[@id='remove-sauce-labs-backpack']");
	By tshirtremovefromcart = By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']");
	
	//Click on cart
	By shoppingcart = By.xpath("//a[@class='shopping_cart_link']");
	
	
	//Action methods 
	
	public void backpackAdd()
	{
		driver.findElement(backPackAddtocart).click();
	}
	
	public void bikelight()
	{
		driver.findElement(bikeLightAddtocart).click();
	}
	
	public void tshirt()
	{
		driver.findElement(tshirtAddtocart).click();
	}
	
	public void jacket()
	{
		driver.findElement(jacketAddtocart).click();
	}
	
	public void onesie()
	{
		driver.findElement(onesieAddtocart).click();
	}
	
	public void redTshirt()
	{
		driver.findElement(redTshirtAddtocart).click();
	}
	
	public void backpackremove()
	{
		driver.findElement(backpackremovefromcart).click();
	}
	
	public void tshirtremove()
	{
		driver.findElement(tshirtremovefromcart).click();
	}
	
	
	public void Clickcart()
	{
		driver.findElement(shoppingcart).click();
	}
	
	public void screenshot() throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\soucedemo\\productpage\\screenshot.png");
		FileUtils.copyFile(src, dest);
		
	}
	

}
