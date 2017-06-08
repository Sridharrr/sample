import java.util.*;
import java.io.*;
 class Seed
 { 
	public static void main(String args[])
 	{
 	    Scanner sr=new Scanner(System.in);
 int t=1;		int n=sr.nextInt();
 		int n1=sr.nextInt();
        String s[]=String.valueOf(n).split("");
        int a[]=new int[s.length];
        for(int i=0;i<s.length;i++){
        a[i]=Integer.parseInt(s[i]);    
        }
        
        for(int i:a){
            t=t*i;
        }
        t=t*n;
        if(t==n1)
        {
            System.out.println(n+" Seed of "+n1);
        }
        else{
            System.out.println(n+" is not a seed of "+n1);
        }
 	
 	}}
 
