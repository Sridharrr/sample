import java.util.*;
import java.io.*;
 class FirstRepeated
 { 
	public static void main(String args[])
 	{
 	    Scanner sr=new Scanner(System.in);
 		int i;int n=sr.nextInt();
 		int []a=new int[n];int c=0;
 		for(i=0;i<n;i++)
 		{
 		    a[i]=sr.nextInt();
 		}
 		Set<Integer> s=new HashSet<Integer>();
 		for(i=0;i<n;i++)
 		{
 		    if(s.add(a[i])==false)
 		    {
 		      c=c+1;
 		       System.out.println(a[i]);
 		       break;
 		    }
 		}
 		if(c<=0)
 		{
 		     System.out.println("No repeated values found");
 		}
 	
 	}
 }
