import java.io.*;
import java.util.*;
class ArraySplit{
	public static void main (String[] args) {
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int []a=new int[n];int t=0,z=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=sr.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    t=t+a[i];
		    int m1=i+1;
		    double z1=(double)t/m1;
		   // System.out.println(z1);
		    if(z1==m1)
		    {
		    	z=z+1;
		        int b[]=new int[m1];
		        for(int j=0;j<(m1);j++)
		        { b[j]=a[j];}
		        int n1=n-m1;
		        int c1[]=new int[n1];
		        int k=0;
		        for(i=m1;i<n;i++)
		        {
		            c1[k]=a[i];
		            k++;
		        }
		        if(z!=0){
		    System.out.print(Arrays.toString(b));
		    System.out.print(",");
		    System.out.print(Arrays.toString(c1));
		    }
		    else
		    { System.out.println("impossible");}
 }}}}

