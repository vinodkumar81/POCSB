package Ecommerce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class parent {

	public static void main(String[] args) throws InterruptedException {
	
	   System.setProperty("webdriver.chrome.driver","/Users/test/Downloads/chromedriver");
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.jtv.com");
       Thread.sleep(1000);
       driver.findElementByXPath("//*[@class='boxing rj_search_box']/descendant::*[2]").sendKeys("red ruby earrings");
       driver.findEleme("search_button").click();
       Thread.sleep(1000);
       driver.findElementByXPath("//*[@class='killbox']").click();
       Thread.sleep(1000);
       WebElement element=driver.findElementById("sortBar");
	   Select se=new Select(element);
	   se.selectByVisibleText("PRICE: HIGH TO LOW");
	   Thread.sleep(1000);
	   driver.findElementByXPath("//*[@id='productListing']/descendant::*[12]").click();
	   driver.fi

	}
	
}	


public class addition {
	
	static int a=45;
	
	static int b=60;
	
	static int c;
	
public void add()
{
	c=a+b;
	
System.out.println( "the value of" + "c");
	
	
}
	
public static void main(String[] args) {
		 
		 addition obj=new addition();
		 
		 obj.add();
	}
}