import java.util.*;
import java.io.*;
 class Nonrepeated
 { 
	public static void main(String args[])
 	{ 
         Scanner sr=new Scanner(System.in);
         int n=sr.nextInt();
         int a[]=new int[n];int i,j;
         for(i=0;i<n;i++)
         {
         	a[i]=sr.nextInt();
         }
         for(i=0;i<n;i++)
         {
         	int c=0;
         	for(j=0;j<n;j++)
         	{
         		if(a[i]==a[j])
         		{
         			c=c+1;
         		}
         	}
         	if(c==1)
         	{
         		System.out.println("unique number is "+a[i]);
         	}  }}}
