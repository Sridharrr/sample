import java.util.*;
import java.io.*;
class Holiday
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
String p=sc.next();
String s[]={"Saturday","SUNDAY","Monday","Tuesday","Wednesday","Thursday","Friday"}; 
if(p.equalsIgnoreCase(s[0])||(p.equalsIgnoreCase(s[1])))
{
    System.out.println("false");
}
else if(p.equalsIgnoreCase(s[2])||p.equalsIgnoreCase(s[3])||p.equalsIgnoreCase(s[4])||p.equalsIgnoreCase(s[5])||p.equalsIgnoreCase(s[6]))
{
    System.out.println("true");
}
else
{
    System.out.println("invalid");
}

}
}
