package MyPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteForm {
 
public static void main(String[] args) throws IOException
{
	File file=new File("TestForm/Form.txt");
	FileWriter fw=new FileWriter(file);
	BufferedWriter bw=new BufferedWriter(fw);
	System.out.println("File is created");
	String FirstName="Capgemini";
	bw.write(FirstName);
	bw.newLine();
	String LastName="Automation";
	bw.write(LastName);
	bw.newLine();
	String JobTitle="QA";
	bw.write(JobTitle);
	bw.newLine();
	String City="Bengaluru";
	bw.write(City);
	System.out.println("Data is written successfully");
	bw.close();
}
}
