package MyPackage;

public class Constructor {
	int id;
	String name;
	public Constructor(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public Constructor()
	{
		System.out.println("Capgemini Training in Selenium Java");
		System.out.println("location : Bengaluru");
		System.out.println("Name:Bhavani");
	}
	public void display()
	{
		System.out.println("Id::"+id+ " Name::"+name);
	}
	public static void main(String [] args)
	{
		Constructor c=new Constructor();
		Constructor c1=new Constructor(1,"Bhavani");
		c1.display();
	}

}
