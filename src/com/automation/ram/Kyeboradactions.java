package com.automation.ram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kyeboradactions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb'] "));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(search).build().perform();
		
		ac.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("bjs hub").pause(2000).keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
		
		
		

	}

}
