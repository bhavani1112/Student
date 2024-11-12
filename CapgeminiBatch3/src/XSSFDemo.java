import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSFDemo {
	static File f;
	static FileOutputStream fos;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row,row1,row2,row3,row4,row5,row6,row7,row8;
	static XSSFCell cell,cell1,cell2,cell3,cell4,cell5,cell6,cell7,cell8,cell9;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		f=new File(System.getProperty("user.dir")+"//TestData//Languages.xlsx");
		wb=new XSSFWorkbook();
		sheet=wb.createSheet("ListOfProgrammingLanguages");
		//row 1
		row=sheet.createRow(0);
		cell1=row.createCell(0);
		cell1.setCellValue("John");
		cell2=row.createCell(1);
		cell2.setCellValue("bhavani@gmail.com");
		cell3=row.createCell(2);
		cell3.setCellValue("25");
		cell4=row.createCell(3);
		cell4.setCellValue("9456787564");
		cell5=row.createCell(4);
		cell5.setCellValue("John@123");
		cell6=row.createCell(5);
		cell6.setCellValue("Football");
		cell7=row.createCell(6);
		cell7.setCellValue("Male");
		cell8=row.createCell(7);
		cell8.setCellValue("Chennai");
		cell9=row.createCell(8);
		cell9.setCellValue("ShanthiNagar");
		
		
		
		//row 2
		row1=sheet.createRow(1);
		cell=row1.createCell(0);
		cell.setCellValue("peter@gail.com");
		
		//row3
		row2=sheet.createRow(2);
		cell=row2.createCell(0);
		cell.setCellValue("875635463");
		
		//row4
		row3=sheet.createRow(3);
		cell=row3.createCell(0);
		cell.setCellValue("30");
		
		//row5
		row4=sheet.createRow(4);
		cell=row4.createCell(0);
		cell.setCellValue("PT@89");
		//row6
		row5=sheet.createRow(5);
		cell=row5.createCell(0);
		cell.setCellValue("Cricket");
		//row7
		row6=sheet.createRow(6);
		cell=row6.createCell(0);
		cell.setCellValue("Male");
		//row8
		row7=sheet.createRow(7);
		cell=row7.createCell(0);
		cell.setCellValue("Coimbatore");
		//row9
		row8=sheet.createRow(8);
		cell=row8.createCell(0);
		cell.setCellValue("Shivaji Nagar");
		fos=new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Data Written");
		
		/*
		//Reading values
		fis = new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("ListOfProgrammingLanguages");
		//row 1
		row=sheet.getRow(0);
		cell=row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		
		//row 2
		row1=sheet.getRow(1);
		cell=row1.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		
		//row3
		row2=sheet.getRow(2);
		cell=row2.getCell(0);
		System.out.println(cell.getStringCellValue());
		
				
		//row4
		row3=sheet.getRow(3);
		cell=row3.getCell(0);
		System.out.println(cell.getStringCellValue());
	
		
		
		//row5
		row4=sheet.getRow(4);
		cell=row4.getCell(0);
		System.out.println(cell.getStringCellValue());
		//row6
		row4=sheet.getRow(4);
		cell=row4.getCell(0);
		System.out.println(cell.getStringCellValue());
		//row7
		row4=sheet.getRow(4);
		cell=row4.getCell(0);
		System.out.println(cell.getStringCellValue());
		//row8
		row4=sheet.getRow(4);
		cell=row4.getCell(0);
		System.out.println(cell.getStringCellValue());
		//row9
		row4=sheet.getRow(4);
		cell=row4.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		
		
		
		
		int n=sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows:"+n);
		int m=row.getPhysicalNumberOfCells();
    	System.out.println("no of cells:"+m);
		
		for(int j=0;j<m;j++)
		{		
			System.out.println(sheet.getRow(0).getCell(j).getStringCellValue());
		}
		
		*/
		fos.close();
		wb.close();

	}

}
