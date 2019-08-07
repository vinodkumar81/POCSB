package JTVLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JTVGD {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/test/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://34.203.242.232/jtv1/#!/discover");
		Thread.sleep(10000);
		Login.collection(driver).click();
		Thread.sleep(10000);
		Login.email(driver).sendKeys("cust-3677696@jtv.com");
		Thread.sleep(10000);
		Login.password(driver).sendKeys("P@ssw0rd");
		Thread.sleep(10000);
		Login.submit(driver).click();
		Thread.sleep(30000);
        Login.coachmark(driver).click();
		Thread.sleep(20000);
		Login.coachmark1(driver).click();
		Thread.sleep(20000);
		Login.collectionpage(driver).click();
		Thread.sleep(10000);
		//input type=file then only below statement should work//
		driver.findElementById("createNewCollectionImageUploadButton").sendKeys("/Users/test/Downloads/Screen Shot 2019-03-08 at 4.26.41 PM.png");
		
		
		
		
	}

}
