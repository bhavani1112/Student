package MyPackage;

public class CheckInstanceName {
	public static void main(String[] args)
	{
		CheckInstanceName name=new CheckInstanceName();
		System.out.println(name instanceof CheckInstanceName);
		String result=new String("V & V Training Session");
		boolean output=result instanceof String;
		System.out.println(output);
		
	}

}
