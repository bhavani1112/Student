
public class Array_Sum {
	public static void main(String[] args)
	{
		int[] arr=new int[5];
		arr[0]=20;
		arr[1]=30;
		arr[2]=40;
		arr[3]=50;
		arr[4]=60;
		int sum=0;
		for(int numbers:arr) {
			System.out.print(numbers+" ");
		}
		System.out.println();
		System.out.println("-------------------");
		for(int i=0;i<=4;i++)
		{
			
			sum=sum+arr[i];
		}
		System.out.println("Sum:"+sum);
		
	}

}
