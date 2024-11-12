
public class TestEmployee1 {
	public static void main(String[] args)
	{
		Developer d=new Developer();
		d.empSalary();
		d.empDetails();
		System.out.println("Salary:"+d.empSalary());
		System.out.println("Details:"+d.empDetails());
		Tester t=new Tester();
		t.empSalary();
		t.empDetails();
		System.out.println("Salary:"+t.empSalary());
		System.out.println("Details:"+t.empDetails());
	}
	

}
