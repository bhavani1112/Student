package MyPackage;

import java.util.Scanner;

public class BubbleSortEx1 {
	void sorting(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements:");
		for(int i=0;i<n-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The sorted array is:");
		BubbleSortEx1 b=new BubbleSortEx1();
		b.sorting(arr, n);
		

	}

}