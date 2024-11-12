
public class TestEmployee {
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setEmp_id(001);
		e.setEmp_name("Bhavani");
		e.setEmp_salary(80000);
		int id=e.getEmp_id();
		System.out.println(id);
		String name=e.getEmp_name();
		System.out.println(name);
		int salary=e.getEmp_salary();
		System.out.println(salary);
		
	}

}
