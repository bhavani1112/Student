import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo {
	public static void main(String[]args)
	{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Employee Data");
		Map <String,Object[]> data=new TreeMap<String,Object[]>();
		data.put("1", new Object[] {"COMPANY","DEPARTMENT"});
		data.put("2", new Object[] {"Infosys","IT"});
		data.put("3", new Object[] {"Cognizant","Solution"});
		data.put("4", new Object[] {"Capgemini","QA"});
		data.put("5", new Object[] {"MindTree","Developement"});
		data.put("4", new Object[] {"Capgemini","QA"});
		Set<String> keyset=data.keySet();
		int rownum=0;
		for(String key : keyset)
		{
			Row row=sheet.createRow(rownum++);
			Object [] objArr=data.get(key);
			int cellnum=0;
			for(Object obj : objArr)
			{
				Cell cell=row.createCell(cellnum++);
				if(obj instanceof String)
					cell.setCellValue((String)obj);
				else if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
		}
		try
		{
			FileOutputStream out = new FileOutputStream(new File("TestData//Excel_demo.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("Ecel_demo.xslx written successfully");
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
		
	}

}
