import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sum_XSSF {
	static File f;
	static FileOutputStream fos;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell1,cell2,cell3,cell4,cell5;
	static int a=40,b=50,sum;
	
	

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		f=new File(System.getProperty("user.dir")+"//TestData//Sum1.xlsx");
		wb=new XSSFWorkbook();
		sheet=wb.createSheet("Sum_of_numbers");
		row=sheet.createRow(0);
		cell1=row.createCell(0);
		cell1.setCellValue(a);
		cell2=row.createCell(1);
		cell2.setCellValue("+");
		cell3=row.createCell(2);
		cell3.setCellValue(b);
		cell4=row.createCell(3);
		cell4.setCellValue("=");
		int sum=a+b;
		cell5=row.createCell(4);
		cell5.setCellValue(sum);
		fos=new FileOutputStream(f);
		wb.write(fos);
		System.out.println("sum operation performed");
		
	    
		

	}

}
