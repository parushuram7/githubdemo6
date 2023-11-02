package com.automation.ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_xpathdemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get(" http://www.automationpractice.pl/index.php");
		
		driver.manage().window().maximize();
		
		
//WebElement search = 	driver.findElement(By.xpath("//input[@id='search_query_top'] "));

		WebElement search =                driver.findElement(By.xpath("//input[contains(@id,'search')] "));
		
  search.sendKeys("T-shirts");
  
  Thread.sleep(20000);
  
 //  driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
  
  driver.findElement(By.xpath("//button[@name='submit_search']")).click();
  
		
		
		
		

	}

}
