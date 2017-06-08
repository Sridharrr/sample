import java.util.*;
import java.io.*;
 class Least
 { 
	public static void main(String args[])
 	{
 		Scanner sr=new Scanner(System.in);
 		int n=sr.nextInt();
 		String s1=n+"";
 		int k=sr.nextInt();
 		String s[]=s1.split("");
 		if(k>0&&k<(s.length)){
 		Arrays.sort(s);
			int n1=(s.length)-k;
 	for(int i=0;i<n1;i++){	
 		System.out.print(s[i]);
 	}
 	}
 	else{
 		System.out.print("invalid input");
 	}
 	
 	}
 }
