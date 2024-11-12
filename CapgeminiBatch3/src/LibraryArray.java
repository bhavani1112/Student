import java.util.Arrays;

public class LibraryArray {
	static int largest(int[] arr,int n)
	{
		Arrays.sort(arr);
		return arr[n-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr= {680,100,200,600,500,700};
	int n=arr.length;
	System.out.println(largest(arr,n));

	}

}
