import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectivity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		//Declare a var with URL of database
		String url="jdbc:mysql://localhost/department";
		String userName="root";
		String password="";
		
		//Register with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection(url, userName, password);
		System.out.println("Database Connection Established Successfully");
		

	}

}
