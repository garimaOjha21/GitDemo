package com.selenium.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class ImplicitWaitExample 
{
	public static void main( String args[])
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("H-destination")).sendKeys("NYC");  // if send America 
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class = 'flex-link'])[1]")).click();  // the script will fail here
		
		
		
		driver.close();
		driver.quit();
		
			
		
	}
}
