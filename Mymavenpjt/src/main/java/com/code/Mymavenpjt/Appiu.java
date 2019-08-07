package com.code.Mymavenpjt;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class Appiu{
	
	protected static AndroidDriver driver;

public static void main(String[] args)throws MalformedURLException, Exception{


File file = new File("/Users/test/eclipse-workspace/Mymavenpjt/apk/app-debug.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM, "Android");
		capabilities.setCapability(MobileCapabilityType.VERSION, "5.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "F4AZFG09T798");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		capabilities.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.jtv.debug");//package/
		capabilities.setCapability("appActivity", "com.jtv.activity.LoginActivity");//activity/
		capabilities.setCapability("autoDismissAlerts", true);
		driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(10000);
		
}

}