import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteFile {
	static File f;
	static HSSFWorkbook wb;
	static HSSFSheet sheet;
	static HSSFRow row;
	static HSSFCell cell,cell1,cell2;
	static FileOutputStream fos;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/**
		 * HSSF API
		 * ========
		 * Create a Workbook --> HSSFWorkbook
		 * Create a Sheet -->HSSFSheet
		 * Create a Row -->HSSFRow
		 * Create a Cell -->HSSFCell
		 */
		File f=new File(System.getProperty("user.dir")+"//TestData//Capgemini.xls");
	
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("LoginCredentials");
		System.out.println("Name of the Worksheet:"+sheet.getSheetName());
		HSSFRow row=sheet.createRow(0);
		HSSFCell cell=row.createCell(0);
		cell1=row.createCell(1);
		cell2=row.createCell(2);
		//Set inputs in cell 0 and row 0
		cell.setCellValue("bhavani@gmail.com");
		cell1.setCellValue("123456");
		cell2.setCellValue("Bengaluru");
		
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Data written successfully");

	}

}
