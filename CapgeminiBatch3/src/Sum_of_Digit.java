
public class Sum_of_Digit {
	public static void main(String[]args)
	{
		int i=12345;
		int sum=0;
		int n;
		while(i>0)
		{
			n=i%10;
			sum=sum+n;
			i=i/10;
		}
		System.out.println(sum);
	}

}
