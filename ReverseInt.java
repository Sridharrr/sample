import java.io.*;
import java.util.*;
class ReverseInt{
	public static void main (String[] args) {
		Scanner sr=new Scanner(System.in);
      int n=sr.nextInt();
      String s1=n+"";
      String s2=new StringBuffer(s1).reverse().toString();
       System.out.println(s2);
	}
}
