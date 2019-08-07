package com.jtvqa.baseclass;

import org.openqa.selenium.support.FindBy;

import com.jtvqa.config.Capabilities;

import io.appium.java_client.MobileElement;

public class Login extends Capabilities{

	
	String mobileElement;
	
	@FindBy(id="com.jtv.jewelrytv:id/et_username")
	MobileElement username;
	
	@FindBy(id="com.jtv.jewelrytv:id/et_password")
	MobileElement password;
	
	@FindBy(id="com.jtv.jewelrytv:id/btn_logind")
	MobileElement signin;

	
	public Login(String un,String pwd){
		
		this.mobileElement=un;
		this.mobileElement=pwd;
		username.sendKeys("un");
		password.sendKeys("pwd");
		signin.click();
	}
}	

  
