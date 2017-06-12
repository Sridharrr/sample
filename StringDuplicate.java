import java.io.*;
import java.util.*;

class StringDuplicate {
    
    public static void main(String args[])
    {
    Scanner sr=new Scanner(System.in);
        String s=sr.next();
        char a[]=s.toCharArray();
        Set<Character> s1=new HashSet<Character>();
        for(int i=0;i<(s.length());i++){
            if(s1.add(a[i])!=false){
                System.out.print(a[i]);
            }
        }
    }}
