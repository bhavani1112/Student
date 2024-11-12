
public class Department extends Company {
	int dept_id;
	String dept_name;
	public Department(int dept_id,String dept_name)
	{
		this.dept_id=dept_id;
		this.dept_name=dept_name;
	}
	
	public Department()
	{
		super();
		
	}
	public void display()
	{
		System.out.println("Dep_id:"+dept_id+"Dep_Name::"+dept_name);
		
	}
}
