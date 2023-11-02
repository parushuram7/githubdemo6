package com.automation.ram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     
     driver.manage().window().maximize();
     
     
     driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
     
     Thread.sleep(2000);
     
 	
     driver.switchTo().alert().accept();
    
     driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
     
     Thread.sleep(3000);
     
     //driver.switchTo().alert().accept();
     
     driver.switchTo().alert().dismiss();
     
     driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
     
     Thread.sleep(3000);
     
        Alert    alertwindow =      driver.switchTo().alert();
        
      String info =  alertwindow.getText();
      
      System.out.println(info);
      
         alertwindow.sendKeys("ram selenium");
         
         alertwindow.accept();
    
	}

}
