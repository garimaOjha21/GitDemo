package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokeChromeDriver 
{

	public static void main(String[] args) 
	{
		String url1 = "https://www.google.com";
		String url2 = "https://mail.cognizant.com";
		
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url1);
		System.out.println("title of the page 1 open"+driver.getTitle());
		driver.get(url2);
		System.out.println("title of the page 2 open"+driver.getTitle());		
		driver.navigate().back();
		System.out.println("title of the page open on back"+driver.getTitle());	
		driver.navigate().forward();
		System.out.println("title of the page open on back"+driver.getTitle());	
		driver.close();
		
	}

}
