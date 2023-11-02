package com.automation.ram;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchbrowser1 {

	public static void main(String[] args) throws InterruptedException {
	

		System.out.println("enter the name of browser");
		
		Scanner s = new Scanner(System.in);
		
		  String browser = s.next();
		  
		  
		  if(browser.equalsIgnoreCase("firefox"))
		  {
			 FirefoxDriver f =   new FirefoxDriver();
			 
		             openB(f);
			  
		  }
		  else {
			  
			  ChromeDriver c = new ChromeDriver();
			  	  openB(c);
			  
		  }	
		
	}
	public static void openB(WebDriver w ) throws InterruptedException
	{
		
		w.get("https://www.fb.com");
		
		Thread.sleep(1000);
		
String wurl =w.getCurrentUrl();

   String etitle =  w.getTitle();
   
   System.out.println(wurl+ " " +etitle);
		
	}

}
