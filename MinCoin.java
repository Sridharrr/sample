import java.io.*;
import java.util.*;

class MinCoin{
    
    public static void main(String args[])
    {
   Scanner sr=new Scanner(System.in);
   int n=sr.nextInt();int i;
   int a[]=new int[n];
   for( i=0;i<n;i++){
       a[i]=sr.nextInt();
   }
   Arrays.sort(a);
   int sum=sr.nextInt();i=1;
   while(sum!=0){
       if(sum>=a[n-i]){
           System.out.println(a[n-i]+" Rupee coins "+sum/a[n-i]+" coins");
           sum=sum-(a[n-i]*(sum/(a[n-i])));
           
       }i++;

   }
	}
}
