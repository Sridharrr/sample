import java.util.*;
 class PrimeCount
 { 
	public static void main(String args[])
 	{ 
 		Scanner sr=new Scanner(System.in);
 		int n=sr.nextInt();
 		int c,k=0,k1,k2;
        for(int i=1;i<=n;i++){
        	 c=0;
            if(i==2||i==3||i==5||i==7){
        	    k=k+1;
        	    continue;
        	    }
            for(int j=i/2;j!=0&&j!=1;j--){
        	    if(i%j==0){
        		 c=c+1;
        		 }}
            if(c==0&&i!=1){
        	     k=k+1;
             	}}
		 System.out.println(k);
	} 
}
