package com.jtvqa.config;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Capabilities {
	
static AndroidDriver dr;

	
public static void Android()throws MalformedURLException, Exception {
	     	

	File file = new File("/Users/test/eclipse-workspace/AndroidGD/apk/GemDiscovery-Local-30-(1.2.1-S39-abf6aa1).apk");
            DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability(MobileCapabilityType.PLATFORM,"Android");
			capabilities.setCapability(MobileCapabilityType.VERSION,"7.0");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "0715f742c4750c36");
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");  //Gemstone Origins
			capabilities.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.jtv.jewelrytv");
			capabilities.setCapability("app.activity", "com.jtv.jewelrytv.ui.SplashActivity");
			capabilities.setCapability("autoDismissAlerts", true);
			dr =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			Thread.sleep(10000);
			 dr.findElementById("com.jtv.jewelrytv:id/tabbar_tv_mycollection").click();
			  Thread.sleep(5000);
				dr.findElementById("com.jtv.jewelrytv:id/et_username").sendKeys("cust-6442032@jtv.com");
				Thread.sleep(5000);
				dr.findElementById("com.jtv.jewelrytv:id/et_password").sendKeys("P@ssw0rd");
				Thread.sleep(5000);
				dr.findElementById("com.jtv.jewelrytv:id/btn_login").click();
				Thread.sleep(10000);
				dr.findElementById("com.jtv.jewelrytv:id/tvSave").click();
				Thread.sleep(10000);
				dr.findElementById("com.jtv.jewelrytv:id/btn_next").click();
				Thread.sleep(5000);
			dr.findElementById("com.jtv.jewelrytv:id/btn_ok").click();
             Thread.sleep(5000);
             dr.findElementById("com.jtv.jewelrytv:id/iv_new_item").click();
            //dr.findElementById("com.jtv.jewelrytv:id/fab").click();
			Thread.sleep(5000);
			dr.findElementById("com.jtv.jewelrytv:id/tv_add_collection").click();
		    Thread.sleep(5000);
            dr.findElementById("com.jtv.jewelrytv:id/tv_camera").click();
           dr.f
}         
		public static void main(String[] args) throws MalformedURLException, Exception {	
				Capabilities c=new Capabilities();
			c.Android();
		
				
}
}


