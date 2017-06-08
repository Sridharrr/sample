import java.util.*;
 class LargestNum
 { 
	public static void main(String args[])
 	{ 
      Scanner sr=new Scanner(System.in);
      int a[]=new int[3];
      a[0]=sr.nextInt();
      a[1]=sr.nextInt();
      a[2]=sr.nextInt();
      int b=Math.max(a[0],a[1]);
      b=Math.max(a[2],b);
		System.out.println("Greatest is "+b);
 	}
 }
