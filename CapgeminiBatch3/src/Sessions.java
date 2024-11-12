
public class Sessions {
	int e_id;
	String ename;
	static String comp_name="Capgemini";
	public Sessions(int e_id,String ename)
	{
		this.e_id=e_id;
		this.ename=ename;
	}
	public void display()
	{
		System.out.println("Employee_id::"+e_id);
		System.out.println("Employee_name::"+ename);
	}
	public static void main(String[] args)
	{
		Sessions s=new Sessions(5,"asdd");
		s.display();
		getUserName();
		s.getid();
		
	}
	public static void getUserName()
	{
		System.out.println("john");
		getEmail();
	}
	public  void getid()
	{
		System.out.println("13243");
		getUserid();
	}
	public  void getUserid()
	{
		System.out.println("132");
	}
	public  static void getEmail()
	{
		System.out.println("capgemini@gmail.com");
		
	}

}
