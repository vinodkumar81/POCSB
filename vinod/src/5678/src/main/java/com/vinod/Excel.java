package com.vinod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Excel {
	WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    static XSSFCell cell;
@Test
	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	System.setProperty("webdriver.chrome.driver","/Users/test/Downloads/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.jtv.com");
    Thread.sleep(5000);
    driver.findElementByXPath("//*[@class='account-text-large']").click();
    Thread.sleep(3000);
driver.findElementByXPath("//*[@class='icon-close-x']").click();
Thread.sleep(3000);
 driver.findElementByXPath("//*[@class='button primary']").click();
    Thread.sleep(5000);
    FileInputStream fis = new FileInputStream("//Users//test//Downloads//Testdata.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet=workbook.getSheet("sheet1");
    for(int i=1; i<=sheet.getLastRowNum(); i++){
    	
     cell = sheet.getRow(i).getCell(0);
  
    driver.findElementById("first").sendKeys(cell.getStringCellValue());
  
    cell = sheet.getRow(i).getCell(1);
    driver.findElementById("last").sendKeys(cell.getStringCellValue());
    
    cell = sheet.getRow(i).getCell(2);
driver.findElementById("email").sendKeys(cell.getStringCellValue());

cell = sheet.getRow(i).getCell(3);
    driver.findElementById("emailConfirm").sendKeys(cell.getStringCellValue());
    
cell = sheet.getRow(i).getCell(4);
    driver.findElementById("password").sendKeys(cell.getStringCellValue());
    
    cell = sheet.getRow(i).getCell(5);
    driver.findElementById("passwordConfirm").sendKeys(cell.getStringCellValue());
    
    cell = sheet.getRow(i).getCell(6);
   System.out.println(cell);
  
   System.out.println(String.valueOf(cell.getNumericCellValue()));
    
driver.findElementById("phone").sendKeys(String.valueOf(cell.getNumericCellValue()));
  
    driver.findElementByName("submit").click();
    Thread.sleep(5000);
   
    }
}
	
}