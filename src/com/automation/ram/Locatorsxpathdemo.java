package com.automation.ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsxpathdemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\Acer\\Desktop\\login.html");
		
		WebElement login = driver.findElement(By.xpath("/html/body/input[2]"));
		
		login.sendKeys("ramganesh@666");
		
		 WebElement login1 =  driver.findElement(By.xpath("/html/body/input[1]"));
		 
		 login1.sendKeys("username");
		
		Thread.sleep(5000);
		
		
		driver.close();
		
		
		
		
	}
	
	
}




