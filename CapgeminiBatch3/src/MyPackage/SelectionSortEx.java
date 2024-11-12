package MyPackage;

import java.util.Scanner;

public class SelectionSortEx {

	     void selectionDemo(int arr[],int n)
	     {
		// TODO Auto-generated method stub
	    	 
	    	 for(int i=0;i<n-1;i++)
	    	 {
	    		 int min=i;
	    		 for(int j=i+1;j<n;j++)
	    		 {
	    			 if(arr[j]<arr[min])
	    			 {
			
	    				 int temp=arr[min];
	    				 arr[min]=arr[j];
	    				 arr[j]=temp;
	    			 }

	    		 }
	    	 }
	    	 System.out.println("Sorted Array Ascending:");
	    	 for(int i=0;i<n;i++)
	    	 {
	    		 System.out.println(arr[i]);
	    	 }

	     }
	     void selectionDemo1(int arr[],int n)
	     {
		// TODO Auto-generated method stub
	    	 
	    	 for(int p=0;p<n-1;p++)
	    	 {
	    		 int min1=p;
	    		 for(int q=p+1;q<n;q++)
	    		 {
	    			 if(arr[q]>arr[min1])
	    			 {
			
	    				 int temp=arr[min1];
	    				 arr[min1]=arr[q];
	    				 arr[q]=temp;
	    			 }

	    		 }
	    	 }
	    	 System.out.println("Sorted Array Descending:");
	    	 for(int i=0;i<n;i++)
	    	 {
	    		 System.out.println(arr[i]);
	    	 }

	     }
	     public static void main(String[]args)
	     {
	    	 Scanner sc=new Scanner(System.in);
	 		System.out.println("Enter the size of an array");
	 		int n=sc.nextInt();
	 		int[] arr = new int[n];
	 		System.out.println("enter elements:");
	 		for(int i=0;i<n;i++) {
	 			arr[i]=sc.nextInt();
	 		}
	 		SelectionSortEx s=new SelectionSortEx();
	 		s.selectionDemo(arr, n);
	 		s.selectionDemo1(arr, n);
	 		
	     }
}
	
