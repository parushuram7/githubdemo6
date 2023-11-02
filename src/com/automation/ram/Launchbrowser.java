package com.automation.ram;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchbrowser {

	public static void main(String[] args) {
              
		
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
	
	
	public static void openB(FirefoxDriver f)
	{
		
		f.get("https://fb.com");
		
String furl =	f.getCurrentUrl();
	
           String ftitle =   f.getTitle();
           
           
           System.out.println(furl + ""  +ftitle);
          	
		
	}
	
	
	public static void openB(ChromeDriver c)
	{
		
		c.get("https://fb.com");
		
	String  curl =	c.getCurrentUrl();
	
	   String ctitle = c.getTitle();
	   
	   System.out.println(curl + " "+ctitle);
		
	}
	
	
	
	
	

}

