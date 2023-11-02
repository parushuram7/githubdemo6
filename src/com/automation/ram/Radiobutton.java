package com.automation.ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='radio'][1] ")).click();
		
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		
		
		
		
		
		
		

	}

}
