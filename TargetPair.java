import java.io.*;
import java.util.*;

class TargetPair {
    
    public static void main(String args[])
    {
    Scanner sr=new Scanner(System.in);
    int n=sr.nextInt();int i,j,k;
 int a[]=new int[n];int b[]=new int[2];b[0]=0;
 int t=sr.nextInt();
 for(i=0;i<n;i++){a[i]=sr.nextInt();}
     for(i=0;i<n;i++){k=0;
         for(j=0;j<n;j++){
             if(i!=j){
                 if(a[i]+a[j]==t){
                     if(b[k]!=a[j]){
                     b[k]=a[i];b[k+1]=a[j];
                     System.out.println(a[i]+","+a[j]);
                 }}
             }
         }
         
 
    }}}
