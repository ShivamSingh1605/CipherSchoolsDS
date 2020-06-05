import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t>0)
	 {
	     int n=sc.nextInt();
	     int arr[]=new int[n];
	     for(int i=0;i<n;i++)
	     {
	         arr[i]=sc.nextInt();
	     }
	     int start=0;
	     int end=n-1;
	     int res=-1;
	     
	     while(start<=end)
	     {
	         int mid=start+(end-start)/2;
	         if(arr[mid]==0)
	         {res=mid;
	             end=mid-1;
	         }
	         else
	         {
	             start=mid+1;
	         }
	     }
	     if(res==-1)
	     {
	         System.out.println("0");
	     }
	     else
	     {
	         System.out.println(n-res);
	     }
	    t--; 
	 }
	 }
}