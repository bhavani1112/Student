import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteText {
 
public static void main(String[] args) throws IOException
{
	File file=new File("TestData/Login.txt");
	FileWriter fw=new FileWriter(file);
	BufferedWriter bw=new BufferedWriter(fw);
	System.out.println("File is created");
	String UserName="john";
	bw.write(UserName);
	bw.newLine();
	String Password="12345";
	bw.write(Password);
	System.out.println("Data is written successfully");
	bw.close();
}
}
