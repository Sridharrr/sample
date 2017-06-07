import java.io.*;
import java.util.*;
class Fact{
	public static void main (String[] args) {
		Scanner sr=new Scanner(System.in);
       int n=sr.nextInt();int t=1;
       for(int i=1;i<=n;i++)
       {
           t=t*i;
       }
       System.out.println(t);
	}
}
