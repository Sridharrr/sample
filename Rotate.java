import java.util.*;
 class Rotate
 { 
	public static void main(String args[])
 	{
 		 Scanner sr=new Scanner(System.in);
 	     int n=sr.nextInt();
 	     int[] a=new int[n];
 	     int m=sr.nextInt();int i,b=0,j;
 	     for(i=0;i<n;i++)
 	     {
      		a[i]=sr.nextInt();
      	}
      	System.out.println(Arrays.toString(a));

      	for(i=0;i<m;i++)
      	{ int k=0;
      b=a[n-1];
      		for(j=n-1;j>=0;j--)
      			{
      				if(j!=0){
      		a[j]=a[j-1];}
      		}
      		if(k==0){
      			a[k]=b;}
      		}
		System.out.println(Arrays.toString(a));

 	}
 }
