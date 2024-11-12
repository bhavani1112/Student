
public class DemoException
{
	int age;
	public static void main(String[] args)
	{
		/*int i=10;
		int j=0;
		try
		{
			int k=i/j;
			System.out.println("div::"+k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled Successfully");
		}
		finally
		{
			System.out.println("finally executed");
		}*/
		public void getAge(int age) throws Exception
		{
			if(age<18)
			{
				throw new Exception("Age is less than 18");
			}
			else
			{
				System.out.println("more than 18");
			}
		}

	}
}
