package com.automation.ram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlelinks {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		
	List<WebElement> links =	driver.findElements(By.tagName("a"));
	
System.out.println("Number of links present:"  +links.size());
		
for(WebElement link : links)
{
	
	
	System.out.println(link.getText());
}
	
		
		
		
		
		
		
		
		

	}

}
