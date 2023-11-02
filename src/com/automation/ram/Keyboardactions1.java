package com.automation.ram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions1 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		  WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText'] "));
		  
		     WebElement input2  = driver.findElement(By.xpath("//textarea[@id='inputText2'] "));
		
		    input1.sendKeys("welcome to ram selenium");
		    
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL);
		
		act.sendKeys("A");
		
		act.keyUp(Keys.CONTROL);
		
		act.perform();
		
		
		    act.keyDown(Keys.CONTROL);
		    
		    act.sendKeys("C");
		    
		    act.keyUp(Keys.CONTROL);
		    
		    act.perform();
		    
		    
		    act.sendKeys(Keys.TAB);
		    
		    act.perform();
		    
		    
		    act.keyDown(Keys.CONTROL);
		    
		    act.sendKeys("V");
		    act.keyUp(Keys.CONTROL);
		    
		    act.perform();
		    
		    
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
