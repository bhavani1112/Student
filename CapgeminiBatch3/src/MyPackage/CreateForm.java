package MyPackage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class CreateForm {
	static File f;
	static FileReader fr;
	static BufferedReader br;
	public static void main(String[] args) throws IOException
	{
		f=new File(System.getProperty("user.dir")+"//TestForm//Form.txt");
		System.out.println("FileName:"+f.getName());
		fr=new FileReader(f);
		br=new BufferedReader(fr);
		String line=null;//declare and initialize String object
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
	
	}
}
