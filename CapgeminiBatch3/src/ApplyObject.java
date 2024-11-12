
public class ApplyObject {
	public static void main(String[]args)
	{
		ApplyObject obj=new ApplyObject();
		ApplyAbstract abs=new ApplyAbstract();
		boolean status_equal=obj.equals(abs);
		System.out.println("Is both objets same:"+status_equal);
		System.out.println("------------------------------------------");
		String name_class=obj.getClass().getName();
		System.out.println("Class Name is::"+name_class);
		System.out.println("------------------------------------------");
		int hashcode_obj=obj.hashCode();
		System.out.println("Hashcode::"+hashcode_obj);
		int hashcode_abs=abs.hashCode();
		System.out.println("Hashcode::"+hashcode_abs);
		System.out.println("------------------------------------------");
		System.out.println(obj.toString());
		System.out.println(abs.toString());
		System.out.println("------------------------------------------");
		
	}
	

}
