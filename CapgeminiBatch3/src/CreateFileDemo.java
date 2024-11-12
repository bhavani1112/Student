import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreateFileDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f=new File(System.getProperty("user.dir")+"//TestForm//Capgemini1.xls");
		FileOutputStream fos=new FileOutputStream(f);
		System.out.println("File is Successfully Created");

	}

}
