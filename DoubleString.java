import java.io.*;
import java.util.*;
class DoubleString {
    public static void main(String args[]){
        Scanner sr=new Scanner(System.in);
        String s1=sr.next();
        String s2=s1.substring(0,s1.length()/2);
        String s3=s1.substring(s1.length()/2);
        if(s2.equals(s3)){
            System.out.print("Given String is Double String");
        }
        else{
            System.out.print("Givem String is Not an Double String");
        }}}
