package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameIamNotRobot {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spotify.com/in/signup/");/*
		int count = driver.findElements(By.tagName("iframe")).size();
		int i ;		
		for (i=0 ; i<count ; i++)
		{
			driver.switchTo().frame(i);
			int c = driver.findElements(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).size();
			if (c > 0)
			{
				break;
			}
			driver.switchTo().defaultContent();
		}*/
		int frameId = findFrame(driver , By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
		driver.switchTo().frame(frameId);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
		driver.switchTo().defaultContent();
		int frameId1 = findFrame(driver , By.xpath("//button[@class='rc-button-default goog-inline-block']"));
	//	driver.switchTo().frame(frameId1);
		System.out.println(frameId1);
	}	
		
	public static int findFrame(WebDriver driver , By locator)	
	{	
		int count = driver.findElements(By.tagName("iframe")).size();
		int i ;		
		for (i=0 ; i<count ; i++)
		{
			driver.switchTo().frame(i);
			int c = driver.findElements(locator).size();
			if (c > 0)
			{
				driver.switchTo().defaultContent();
				break;
			}
			driver.switchTo().defaultContent();
		}
		return i;
	}

}
