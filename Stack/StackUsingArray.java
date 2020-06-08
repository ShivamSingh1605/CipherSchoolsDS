package Stack;

import java.util.Scanner;

class Stacka
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	int top=-1;
	boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else return false;
		
	}
	int peek()
	{
		if(this.isEmpty())
		{
			System.out.println("no elemrnt are there");
			return -1;
		}
		return arr[top];
	}
	void push(int data)
	{
		if(top>n)
		{
			System.out.println("index is more than entered");
			return;
		}
		++top;
		arr[top]=data;
		//arr[++top]=data;
	}
	int pop()
	{
		if(this.isEmpty())
		{
			System.out.println("no element left");
			return -1;
		}
		int x=arr[top];
		top--;
		return x;
	}
	
}

public class StackUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacka s=new Stacka();
		s.push(35);
		System.out.println(s.pop());

	}

}
