import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t>0)
	 {int n=sc.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
	     arr[i]=sc.nextInt();
	 }
	 Stack<Integer> s=new Stack<>();
	 ArrayList<Integer> a=new ArrayList<>();
	 for(int i=n-1; i>=0;i--)
	 {
	     if(s.isEmpty())
	     {
	         a.add(-1);
	     }
	     else if(!s.isEmpty() && s.peek()>arr[i])
	     {
	         a.add(s.peek());
	     }
	     else if(s.size()>0 &&s.peek()<arr[i])
	     {
	         while(s.size()>0&&s.peek()<arr[i])
	         {
	             s.pop();
	         }
	         if(s.isEmpty())
	         {
	             a.add(-1);
	         }
	         else
	         {
	             a.add(s.peek());
	             
	         }
	         
	     }s.push(arr[i]);
	     
	 }
	 
	     Collections.reverse(a);
	     for(int i=0;i<n;i++)
	     
	     {
	         System.out.print(a.get(i)+" " );
	     }
	     System.out.println();
	 
	 
	 
	     t--;
	 }
	 }
	 }
}