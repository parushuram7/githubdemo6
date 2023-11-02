package com.automation.ram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebrowserwindows {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
	         
	    Thread.sleep(3000);
		
		
	    driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc'] ")).click();
	    
	    
	       Set<String > windowshandelsid = driver.getWindowHandles();
	       
	       for(String winid : windowshandelsid)
	       {
	    	   
	    	String title =   driver.switchTo().window(winid).getTitle();
	    	
	    	System.out.println(title);
	    	   
	       }
		
		
		driver.quit();
		
		
		
		
		

	}

}
