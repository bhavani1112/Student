package MyPackage;

public class InsertionSortEx {
	void insertion(int[ ] arr)
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,11,13,5,6};
		int n=arr.length;
		InsertionSortEx ins=new InsertionSortEx();
		ins.insertion(arr);
		System.out.println("Sorted array:");
		{
			
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
		}
		
		

	}

}
