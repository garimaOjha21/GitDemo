package com.selenium.prac;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioFromToDatePassInrGo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		//find total radio button for ctl00$mainContent$rbtnl_Trip group
		int countTrip;
		
		countTrip = driver.findElements(By.name("ctl00$mainContent$rbtnl_Trip")).size();
		WebElement ow = driver.findElement(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip'] //input[@value='OneWay']"));
		Assert.assertTrue(ow.isSelected());
		if(ow.isSelected())
		{
			driver.findElement(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip'] //input[@value='RoundTrip']")).click();
			System.out.println("enable" + driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"));
		}
		else
			ow.click();
		
		//select from location
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT'] ")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		Thread.sleep(2000L);
		//select current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000L);
		//select passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("hrefIncInf")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("total check boxes" + driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();0
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
