package Ecommerce;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.BatchUpdateException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class readexcel {
	
	public void readExcel() throws BatchUpdateException, IOException, EncryptedDocumentException, InvalidFormatException {
	
		FileInputStream fs = new FileInputStream("/Users/test/Downloads/SFC_CONTACT (1).xlsx");
		Workbook wb=WorkbookFactory.create(fs);;

		// TO get the access to the sheet
		Sheet sh = wb.getSheet("FREQUENCY");

		// To get the number of rows present in sheet
		Object totalNoOfRows = sh.getRowBreaks();

		// To get the number of columns present in sheet
		Object totalNoOfCols = sh.getColumnBreaks();
	}
		

	public static void main(String args[]) throws BatchUpdateException, IOException, EncryptedDocumentException, InvalidFormatException {
		readexcel DT = new readexcel();
		DT.readExcel();
	}
}
