package Ecommerce;

import org.openqa.selenium.chrome.ChromeDriver;

public class child {

	public static void main(String[] args) throws InterruptedException {
		
	
		
	System.setProperty("webdriver.chrome.driver","/Users/test/Downloads/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.nseindia.com/products/content/derivatives/equities/historical_fo.htm");
    Thread.sleep(5000);
    driver.findElementByName("txtUserName").sendKeys("anuj.suri@gmail.com");
    Thread.sleep(3000);
    driver.findElementByName("password").sendKeys("sourcebits");
    Thread.sleep(3000);
    driver.findElementByXPath("//*[@id='login-button']").click();
    Thread.sleep(5000);
    driver.findElementByXPath("//*[@class='landing-screen']/following::*[2]").click();
    }

}
