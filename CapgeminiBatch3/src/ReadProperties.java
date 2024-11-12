import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ReadProperties {
	static File f;
	static FileInputStream fis;
	static Properties p;
	public static void main(String[] args) throws IOException
	{
		f=new File(System.getProperty("user.dir")+"//TestData//Login.txt");
		fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		String username=p.getProperty("UserName");
		System.out.println(username);
		String password=p.getProperty("Password");
		System.out.println(password);
	}

}
