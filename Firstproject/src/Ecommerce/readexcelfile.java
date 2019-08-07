package Ecommerce;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readexcelfile {
	
	
	

	public void readexcel() throws BiffException, IOException {
		String FilePath = "/Users/test/Downloads/SFC_CONTACT.xls";
		FileInputStream fs = new FileInputStream("/Users/test/Downloads/SFC_CONTACT.xls");
		Workbook wb = Workbook.getWorkbook(fs);

		// TO get the access to the sheet
		Sheet sh = wb.getSheet("SFC_Address");

		// To get the number of rows present in sheet
		int totalNoOfRows = sh.getRows();

		// To get the number of columns present in sheet
		int totalNoOfCols = sh.getColumns();

		for (int row = 0; row < totalNoOfRows; row++) {

			for (int col = 0; col < totalNoOfCols; col++) {
				System.out.print(sh.getCell(col, row).getContents() + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) throws BiffException, IOException {
		readexcelfile h = new readexcelfile();
		h.readexcel();
	}

	}



