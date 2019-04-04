package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) 
	{		
				
	System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.facebook.com/";
	driver.get(url);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testme@gmail.com");
	driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys("tisting");
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	driver.close();
	
	}

}
