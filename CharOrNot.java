import java.util.*;
 class CharOrNot
 { 
	public static void main(String args[])
 	{ boolean s;
Scanner sr=new Scanner(System.in);
char c=sr.next().charAt(0);
s=Character.isLetter(c);
System.out.print(s);
 	}
 }
