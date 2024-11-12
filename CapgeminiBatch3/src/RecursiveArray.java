
public class RecursiveArray {
	static int largest(int arr[],int n,int i)
	{
		if(i==n-1)
		{
			return arr[i];
		}
		int recMax=largest(arr,n,i+1);
	
	return Math.max(recMax,arr[i]);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[]= {100,200,600,800,700};
		int n=arr.length;
		System.out.println("largest:"+largest(arr,n,0));

	}

}
