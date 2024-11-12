import java.util.Arrays;
 
public class Bin_Search_logarithm {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,4,7,8};
		int tar=5;
		int res=Arrays.binarySearch(arr, tar);
		if(res<0)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element "+tar+" found at index:"+res);
		}
 
	}
 
}

