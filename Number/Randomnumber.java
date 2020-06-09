package NUmber;

import java.util.HashMap;
import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 Random n=new Random();
                 int arr[]=new int[10];
                 int number=0;
                 for(int i=0;i<10;i++)
                 {
                	while(true)
                	{
                		number=n.nextInt(11);
                		if(number!=0)break;
                	}
                	arr[i]=number;
                	
                	 
                 }
                 for(int j=0;j<10;j++)
                 {
                	 System.out.print(arr[j]+" ");
                 }
                System.out.println();
                 HashMap<Integer,Double> m=new HashMap<>();
                 for(int k=0;k<10;k++)
                 {
                	 if(m.containsKey(arr[k]))
                	 {
                		 m.put(arr[k], m.get(arr[k])+1);
                		 
                	 }
                	 else
                	 {
                		 m.put(arr[k],1.0);
                	 }
                 }
                 for (HashMap.Entry<Integer, Double> e : m.entrySet()) 
                 { 
                     System.out.println(e.getKey() + "===>" + (e.getValue()/10)); 
                 }

	}

}
