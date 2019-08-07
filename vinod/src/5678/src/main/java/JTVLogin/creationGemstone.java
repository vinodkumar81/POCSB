package JTVLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class creationGemstone {
	
	public WebElement element = null;

	
	public  WebElement name(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"modalBodyContent\"]/div[3]/div/div[1]/input"));
		return element;
	}

	public  WebElement variety(WebDriver driver){
		element=driver.findElement(By.id("varietyInput"));
		return element;
	}

	public WebElement species(WebDriver driver) {
		element=driver.findElement(By.id("speciesInput"));
		return element;
	}
     public  WebElement classification(WebDriver driver) throws InterruptedException {
			Select s =new Select(element);
			element=driver.findElement(By.xpath("//*[@id=\"classificationEditable\"]/select"));
			  Actions a=new Actions(driver);
		       a.click().build().perform();
		       Thread.sleep(1000);
		       a.sendKeys("1").build().perform();
		       Thread.sleep(1000);
		       a.sendKeys(Keys.ENTER).build().perform();
			return element;
			}
     public WebElement Description(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@id=\"modalBodyContent\"]/div[3]/div/div[5]/textarea"));
			return element;
}
     //Physical properties//
     
     public WebElement color(WebDriver driver) {
			element=driver.findElement(By.id("customColor"));
			return element;
			//*[@id="createColors"]/div/div/div[2]/div/div/div[7]/div/div/div
     }
    
     
     public  WebElement shape(WebDriver driver) {
			element=driver.findElement(By.id("customShape"));
			return element;
  }
     public  void shape1(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@id=\"createShapes\"]/div/div/div[2]/div/div/div[5]/div/div[1]/img"));
			return;
     }
     public  WebElement cut(WebDriver driver) {
			element=driver.findElement(By.id("customCut"));
			return element;
}
     public  WebElement cut1(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@id=\"createCuts\"]/div/div/div[2]/div/div/div[8]/div/div[1]/img"));
			return element;
			
     }
     public  WebElement flourescence(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@id=\"modalBodyContent\"]/div[5]/div/div[4]/input "));
			return element;
}
  
     public  WebElement size(WebDriver driver) {
			element=driver.findElement(By.id("sizeDesktopCalc "));
			return element;
}  
     
     public  WebElement countryoforigin(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@id=\"modalBodyContent\"]/div[5]/div/div[6]/input"));
			return element;
}  
     
     public  WebElement dimensions(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@id=\"modalBodyContent\"]/div[5]/div/div[7]/div/select"));
			return element;
     
     
     }  
     
     public WebElement treatment(WebDriver driver) {
			element=driver.findElement(By.id("treatmentSelectField"));
			return element;
     }
			public  WebElement phenomenon(WebDriver driver) {
				element=driver.findElement(By.id("phenomenonSelectField"));
				return element;
  }  
			public  WebElement composition(WebDriver driver) {
				element=driver.findElement(By.xpath("//*[@id=\"modalBodyContent\"]/div[7]/div/div[3]/input"));
				return element;
			
			}
	         public  WebElement Acquisitiontype(WebDriver driver) {
					element=driver.findElement(By.xpath("//*[@id=\"acquisitionsEditable\"]/select"));
					return element;
					
	         }
	         public  WebElement vendor(WebDriver driver) {
					element=driver.findElement(By.xpath("//*[@id=\"modalBodyContent\"]/div[9]/div/div[2]/input"));
					return element;
	         }
					  public  WebElement product(WebDriver driver) {
							element=driver.findElement(By.xpath("//*[@id=\"modalBodyContent\"]/div[9]/div/div[3]/input"));
							return element;	
     
					  }
     
					  public WebElement datepicker(WebDriver driver) {
							element=driver.findElement(By.xpath("//*[@id=\"modalBodyContent\"]/div[9]/div/div[4]/div/datepicker/div/div[1]/div[2]"));
							return element;	
					  }
							 public  WebElement price(WebDriver driver) {
									element=driver.findElement(By.id("purchasePriceDesktop"));
									return element;	
							 }
									 public  WebElement appraisal(WebDriver driver) {
											element=driver.findElement(By.xpath("//*[@id=\"modalBodyContent\"]/div[9]/div/div[7]/div/div[1]/div[1]/label"));
											return element;	
									 }
     
     }
