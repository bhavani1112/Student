import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteFileDemo {
	static File f;
	static HSSFWorkbook wb;
	static HSSFSheet sheet;
	static HSSFRow row1,row2;
	static HSSFCell cell1,cell2,cell3,cell4,cell5,cell6;
	static FileOutputStream fos;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File(System.getProperty("user.dir")+"//TestForm//Capgemini1.xls");
		
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("EmployeeDetails");
		System.out.println("Name of the Worksheet:"+sheet.getSheetName());
		//Row 1 Creation
		HSSFRow row1=sheet.createRow(0);
		//Cells Creation
		HSSFCell cell1=row1.createCell(0);
		cell2=row1.createCell(1);
		cell3=row1.createCell(2);
		//Setting the vLues
		cell1.setCellValue("ID");
		cell2.setCellValue("Name");
		cell3.setCellValue("Location");
		//Row 2 Creation
		HSSFRow row2=sheet.createRow(1);
		//Cells Creation
		HSSFCell cell4=row2.createCell(0);
		cell5=row2.createCell(1);
		cell6=row2.createCell(2);
		//Setting the vLues
		cell4.setCellValue("4567");
		cell5.setCellValue("gvbkj");
		cell6.setCellValue("gvhbjnkl");
		
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Data written successfully");


	}

}
