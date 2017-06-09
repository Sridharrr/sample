import java.util.*;
 class Dcoder
 { 
	public static void main(String args[])
 	{ 
 		Scanner sr=new Scanner(System.in);
 		String s=sr.next();boolean b;
 		char s1[]=new char[s.length()];
 		for(int i=0;i<s.length();i++){
 			b=Character.isUpperCase(s.charAt(i));
 		if(b==true){
 		s1[i]=Character.toLowerCase(s.charAt(i));
 		}
 		else
 		{
 			s1[i]=Character.toUpperCase(s.charAt(i));
 		}
 		System.out.print(s1[i]);
 		}}}
