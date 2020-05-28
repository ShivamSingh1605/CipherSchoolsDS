package BinarySearch;

import java.util.Scanner;

public class FirstAndLastOccurence {
	// Let our array be 2 4 10 10 10 18 20 here we have find the first 
	//occurence of 10 and its last occurence
	public int FirstOcuurence(int arr[],int x)
	{
		int start =0;
		int end =arr.length-1;
		int res=-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if (arr[mid]==x)
			{
				 res=mid;
				end=mid-1;
			}
			else if(arr[mid]>x)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
			
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FirstAndLastOccurence obj=new FirstAndLastOccurence();
		System.out.println("Enter no of element in array");
		int NoOfElementInArray=sc.nextInt();
		int arr[]=new int[NoOfElementInArray];
		System.out.println("Enter first element");
		for(int i=0;i<NoOfElementInArray;i++)
		{
			 arr[i]=sc.nextInt();
			 System.out.println("enter next element");
		}
		System.out.println("enter element to be search");
		int ElementToSearch=sc.nextInt();
		int ElementPresentAt=obj.FirstOcuurence( arr, ElementToSearch );
		System.out.println(ElementPresentAt);
		

	}

}
