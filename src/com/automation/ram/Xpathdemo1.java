package com.automation.ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		
		Thread.sleep(3000);
		
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.xpath("/html/body/div[3]/a[6] ")).click();
		
		
		

	}

}
