package com.automation.ram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoperations {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
         //  WebElement button =	driver.findElement(By.xpath("//button[@type='button'] "));
		
		
		 //  WebElement button =  driver.findElement(By.xpath("//button[@id='dblClkBtn'] "));
		
		   WebElement imgsource =  driver.findElement(By.xpath("//img[@id='myImage'] "));
		   
		   WebElement  imgtarget  =       driver.findElement(By.xpath("//div[@id='targetDiv'] "));
		
           
           Actions act = new Actions(driver);
           
             act.clickAndHold(imgsource).release(imgtarget).build().perform();
             
             
           
           //act.contextClick(button).perform();
           
           
          // act.doubleClick(button).perform();
           
          // Thread.sleep(1000);
           
      // Alert   alertwindow =  driver.switchTo().alert();
       
      // alertwindow.getText();
       
      // System.out.println(alertwindow.getText());
       
        // alertwindow.accept();
       
             
       
           
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
