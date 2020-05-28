package BinarySearch;

import java.util.Scanner;

public class DescendingBS {
	public int BinarySearch(int arr[],int x)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==x) return mid;
			else if(arr[mid]<x)
			{
			end=mid-1;
				
			}
			else
			{
				start=mid+1;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		BinarySearchAlgorithms obj=new BinarySearchAlgorithms();
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
		int ElementPresentAt=obj.BinarySearch( arr, ElementToSearch );
		System.out.println(ElementPresentAt);
	}

}
