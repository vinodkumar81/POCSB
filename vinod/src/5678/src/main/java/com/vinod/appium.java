package com.vinod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class appium {
	
	public static AndroidDriver dr ;

	public static void main(String[] args)throws MalformedURLException, Exception{


	File file = new File("/Users/test/eclipse-workspace/vinod/src/5678/apk/JTV Gov2.1.25-Snapshot-3 (1).apk");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM, "Android");
			capabilities.setCapability(MobileCapabilityType.VERSION, "7.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "0715f742c4750c36");
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			capabilities.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.jtv.debug");//package/
			capabilities.setCapability("app.activity", "com.jtv.activity.SplashActivity");//activity/
			capabilities.setCapability("autoDismissAlerts", true);
			dr =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			Thread.sleep(10000);
		    dr.findElementById("com.jtv.debug:id/btnActionTutorial").click();
		    Thread.sleep(10000);
			dr.findElementById("com.jtv.debug:id/tvSkipTutorial").click();
			Thread.sleep(10000);
			dr.findElementById("com.jtv.debug:id/btnGotoLoginPage").click();
			Thread.sleep(40000);
		
			    Set<String> contextHandles=dr.getContextHandles();
			    
			    for(String s :contextHandles) {
			   System.out.println("Context : " +s);
			     if (s.contains("WEBVIEW")) {
			        	dr.context(s);
			     }
			     
			    }  
          dr.findElementById("email").sendKeys("meetvinod2009@gmail.com");
          dr.findElementByXPath("password").sendKeys("Vinod@123");


	       
	}

	}
			
	
	


