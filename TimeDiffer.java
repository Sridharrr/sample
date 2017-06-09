import java.io.*;
import java.util.*;

class TimeDiffer {
    public static void main(String args[])
    {
        Scanner sr=new Scanner(System.in);
        double n=sr.nextDouble();
        double n1=sr.nextDouble();
        int m1=((int)n/1);
        int m2=(int)n1/1;
        float min=(float)(n-m1)*100;
        float min1=(float)(n1-m2)*100;
        m1=(m1*60)+(int)min;
        m2=(m2*60)+(int)min1;
        int m=m1-m2;
        if(m>0){
            System.out.println("Difference is "+m+" minutes");
        }
        else
        {
            System.out.println("Difference is "+(-m)+" minutes");
        }
        }
          }
