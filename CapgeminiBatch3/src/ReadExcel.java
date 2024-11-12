import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ReadExcel {
	static File f;
	static FileInputStream fis;
	static HSSFWorkbook wb;
	static HSSFSheet sheet;
	static HSSFRow row1,row2;
	static HSSFCell cell1,cell2,cell3,cell4,cell5,cell6;
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * Read the data from Excel
		 * Display all data from excel file in console
		 * ====================
		 * File
		 * FileOutputStream
		 * ==============================
		 * Get a Workbook --->HSSFWorkbook
		 * Get a Sheet  ---->HSSFSheet
		 * Get a Row ---->HSSFRow
		 * Get a Cell --->HSSFCell
		 */
		f=new File(System.getProperty("user.dir")+"//TestForm//Capgemini1.xls");
		fis=new FileInputStream(f);
		wb=new HSSFWorkbook(fis);
		//retreive sheet
		sheet = wb.getSheet("EmployeeDetails");
		//creating row1
		row1=sheet.getRow(0);
		//creating cells
		cell1=row1.getCell(0);
		cell2=row1.getCell(1);
		cell3=row1.getCell(2);
		//retreive the values
		System.out.println(cell1.getStringCellValue());
		System.out.println(cell2.getStringCellValue());
		System.out.println(cell3.getStringCellValue());
		//creating row2
		row2=sheet.getRow(1);
		//creating cells
		cell4=row2.getCell(0);
		cell5=row2.getCell(1);
		cell6=row2.getCell(2);
		//retreive the values
		System.out.println(cell4.getStringCellValue());
		System.out.println(cell5.getStringCellValue());
		System.out.println(cell6.getStringCellValue());
		
		
	}

}
