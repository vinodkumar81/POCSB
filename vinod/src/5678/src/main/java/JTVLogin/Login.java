package JTVLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	private static WebElement element = null;
	
	
	
	public static WebElement collection(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"mycollection-page-link\"]/span"));
		return element;
	
	}
	
	public static WebElement email(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/div/div/div[2]/div/div[2]/form/div[1]/input"));
		return element;
}
	
	public static WebElement password(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/div/div/div[2]/div/div[2]/form/div[2]/div/input"));
		return element;
}

	public static WebElement submit(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"loginPopup\"]/div/div/div[2]/div/div[2]/form/div[4]/button"));
		return element;

	}
	
	public static WebElement coachmark(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"btnCoachMarkNext\"]"));
		return element;
	}
	
	public static WebElement coachmark1(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"btnCoachMarkOk\"]"));
		return element;
	}
	public static WebElement collectionpage(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"collection-landing\"]/div[1]/div/span[1]/span"));
		return element;
	}
	
	

	
}	