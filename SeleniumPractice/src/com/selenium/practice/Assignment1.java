package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment1 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe"); // set the system property for chrome driver
		WebDriver driver = new ChromeDriver();                             // create an instance for webdriver
		driver.get("https://www.cleartrip.com/");                        // open the brover with given link
		Select sAdult = new Select(driver.findElement(By.xpath("//select [@id = 'Adults']"))); // create Select object with adult xpath
		sAdult.selectByValue("2");                        //select the value of adult as 2
		
		Select sChild = new Select(driver.findElement(By.xpath("//select[@id ='Childrens']"))); // create Select object with child xpath
		sChild.selectByIndex(4);                                // s4lect the value at 4th index
		
		driver.findElement(By.xpath("//input[@id = 'DepartDate']")).click();   // cxlick the departure date 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); // click the date highlighted in blue
		driver.findElement(By.xpath("//a[@id ='MoreOptionsLink']")).click();  // click the link
		driver.findElement(By.xpath("//input[@id = 'AirlineAutocomplete']")).sendKeys("indigo");  // input the value in input box.
		driver.findElement(By.xpath("//input[@id = 'SearchBtn']")).click();    // click submit for search
		System.out.println(driver.findElement(By.xpath("//div[@id ='homeErrorMessage']")).getText());    //read the error message and display it.
		
		Thread.sleep(10000L);
		
		driver.close();	
		

	}

}
