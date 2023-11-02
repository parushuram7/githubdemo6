package com.automation.ram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("welcome to ram selenium");
		
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\Acer\\Desktop\\selenium softwares & jars\\chromedriver-win64\\chromedriver.exe");
		
		 
	WebDriver driver =	new ChromeDriver();
	
	   driver.get(" https://fb.com");
	   
	   driver.manage().window().maximize();
	   
	      String pagesource =     driver.getPageSource();
	      
	      
	      System.out.println(pagesource);
	   
	   Thread.sleep(5000);
	   
	   
	   
	   
	   
	  String url = driver.getCurrentUrl();

	  System.out.println(url);
	  
	  String atitle = "facebook";
	  
	  
	 String etitle = driver.getTitle();
	 
	if(etitle.equals(atitle))
	{
		
		System.out.println(etitle);
		
	}
	else {
		
		System.out.println(atitle);
	}
		 

	}

}
