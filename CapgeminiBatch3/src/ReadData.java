import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadData {
	static File f;
	static FileReader fr;
	static BufferedReader br;
	public static void main(String[] args) throws IOException
	{
		f=new File(System.getProperty("user.dir")+"//TestData//Login.txt");
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
