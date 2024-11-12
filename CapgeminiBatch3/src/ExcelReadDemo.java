import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadDemo {
	static File f;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row1,row2,row3,row4,row5;
	static XSSFCell cell1,cell2,cell4,cell5,cell6,cell7,cell8,cell9,cell10,cell11;
	
	

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
		f=new File(System.getProperty("user.dir")+"//TestData//Excel_demo.xlsx");
		fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		//retreive sheet
		sheet = wb.getSheet("Employee Data");
		//creating row1
		row1=sheet.getRow(0);
		//creating cells
		cell1=row1.getCell(0);
		cell2=row1.getCell(1);
		
		//retreive the values
		System.out.println(cell1.getStringCellValue());
		System.out.println(cell2.getStringCellValue());
		
		//creating row2
		row2=sheet.getRow(1);
		//creating cells
		cell4=row2.getCell(0);
		cell5=row2.getCell(1);
		
		//retreive the values
		System.out.println(cell4.getStringCellValue());
		System.out.println(cell5.getStringCellValue());
		//creating row2
				row3=sheet.getRow(2);
				//creating cells
				cell6=row3.getCell(0);
				cell7=row3.getCell(1);
				
				//retreive the values
				System.out.println(cell6.getStringCellValue());
				System.out.println(cell7.getStringCellValue());
				
				//creating row2
				row4=sheet.getRow(3);
				//creating cells
				cell8=row4.getCell(0);
				cell9=row4.getCell(1);
				
				//retreive the values
				System.out.println(cell8.getStringCellValue());
				System.out.println(cell9.getStringCellValue());
				
				//creating row2
				row5=sheet.getRow(4);
				//creating cells
				cell10=row5.getCell(0);
				cell11=row5.getCell(1);
				
				//retreive the values
				System.out.println(cell10.getStringCellValue());
				System.out.println(cell11.getStringCellValue());
				
		
		
		
	}

}
