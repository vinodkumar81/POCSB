package com.vinod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Edit{
	
public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver","/Users/test/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.jtv.com/account/login.jsp");
		Thread.sleep(5000);
		driver.findElementByName("email").sendKeys("meetvinod2009@gmail.com");
		driver.findElementByName("password").sendKeys("Vinod@123"); 
		Thread.sleep(2000);
		driver.findElementByName("submit").click();
		driver.findElementByXPath("//*[@class='account-content']/descendant::*[16]").click();
		Thread.sleep(5000);
		int maxlength=12;

		if (maxlength<10) 
		{
			driver.findElementByName("first").clear();
		
			}
		else {
			driver.findElementByName("first").clear();
			driver.findElementByName("first").sendKeys("varun");
			}

		}
		}