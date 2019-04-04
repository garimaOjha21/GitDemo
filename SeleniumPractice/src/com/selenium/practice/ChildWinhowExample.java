package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class ChildWinhowExample
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		driver.findElement(By.id("H-destination")).sendKeys("NYC");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		WebDriverWait d = new WebDriverWait(driver , 15);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class ='flex-link'])[1]")));
		driver.findElement(By.xpath("(//a[@class ='flex-link'])[1]")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		System.out.println("main parent window titile" + driver.getTitle());
		driver.switchTo().window(childwindow);
		System.out.println("new child window titile" + driver.getTitle());
		driver.switchTo().window(parentwindow);
		System.out.println("back main window titile" + driver.getTitle());
		driver.close();
		driver.switchTo().window(childwindow);
		driver.close();
				
	}

}
