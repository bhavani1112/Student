import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWorkSheet {
	public static void main(String[]args)
	{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Employee Data");
		Map <String,Object[]> data=new TreeMap<String,Object[]>();
		data.put("1", new Object[] {"ID","NAME","LASTNAME"});
		data.put("2", new Object[] {1,"Amit","Shukla"});
		data.put("3", new Object[] {2,"Lokesh","Gupta"});
		data.put("4", new Object[] {3,"John","Adwards"});
		data.put("5", new Object[] {4,"Brian","Scultz"});
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
			FileOutputStream out = new FileOutputStream(new File("TestData//howtodoinjava_demo.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("howtodoinjava_demo.xslx written successfully");
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
		
	}

}
