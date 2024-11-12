import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWrite {
	static File f;
	static FileOutputStream fos;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row,row1,row2;
	static XSSFCell cell,cell1,cell2;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * XSSF API
		 * Perform Reading and Writing Operation Over
		 * The Excel file which is having format .xslx
		 * ------------------------------
		 * Operations
		 * 
		 * -Create an Excel .xlsx file
		 * Write data in the file
		 * -Display or read data from the created excel file
		 * =================
		 */
		f=new File(System.getProperty("user.dir")+"//TestData//Department.xlsx");
		wb=new XSSFWorkbook();
		sheet=wb.createSheet("DepartmentNames");
		row1=sheet.createRow(0);
		Font font=wb.createFont();
		CellStyle style1=wb.createCellStyle();
		style1.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
		style1.setFillPattern(FillPatternType.BIG_SPOTS);
		
		Cell cell1=row1.createCell(0);
		cell1.setCellValue("Department");
		cell1.setCellStyle(style1);
		
		
		//for row2
		row2=sheet.createRow(1);
		CellStyle style2=wb.createCellStyle();
		style2.setFillBackgroundColor(IndexedColors.PINK.getIndex());
		style2.setFillPattern(FillPatternType.BIG_SPOTS);
		Cell cell2=row2.createCell(0);
		cell2.setCellValue("IT");
		cell2.setCellStyle(style2);
		//for row3
		
		//
		
		fos=new FileOutputStream(f);
		System.out.println("File is Created!!!!!!!!");
		wb.write(fos);
		System.out.println("Data is Written in Sheet");
		fos.close();
		wb.close();
		
		
	}

}
