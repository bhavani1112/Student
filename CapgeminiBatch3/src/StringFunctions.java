
public class StringFunctions {
	public static void main(String[ ] args)
	{
		String a="Selenium Java";
		char b=a.charAt(0);
		System.out.println("charAt method:"+b);
		for(int i=0;i<a.length();i++)
		{
			System.out.print(a.charAt(i)+" ");
			
		}
		System.out.println();
		System.out.println("---------------------------------");
		String s1="Java";
		String s2="Java";
		String s3=" Java";
		int c=s2.compareTo(s1);
		int d=s2.compareTo(s3);
		int e=s3.compareTo(s1);
		System.out.println("Compare:"+c);
		System.out.println("Compare:"+d);
		System.out.println("Compare:"+e);
		String f=s1.concat(s2);
		System.out.println("concat:"+f);
		if(s1.contains("Java"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}

	}

