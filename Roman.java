import java.util.*;
 class Roman
 { 
	public static void main(String args[])
 	{ 
 		Scanner sr=new Scanner(System.in);
        String s=sr.next();
       String s1[]=s.split("");
        int i,m=0,c=0;
 for(i=0;i<s1.length;i++){
        	if(i!=s1.length-1){
 if(s1[i].equals("I")&&(s1[i+1].equals("V")||s1[i+1].equals("X")||s1[i+1].equals("L")||s1[i+1].equals("C")||s1[i+1].equals("D")||s1[i+1].equals("M")))
        	{m=m-2;}
 if(s1[i].equals("V")&&(s1[i+1].equals("X")||s1[i+1].equals("L")||s1[i+1].equals("C")||s1[i+1].equals("D")||s1[i+1].equals("M")))
        	{m=m-10;}
 if(s1[i].equals("X")&&(s1[i+1].equals("L")||s1[i+1].equals("C")||s1[i+1].equals("D")||s1[i+1].equals("M")))
            {m=m-20;}   
 if(s1[i].equals("L")&&(s1[i+1].equals("C")||s1[i+1].equals("D")||s1[i+1].equals("M")))
        	{m=m-100;}
 if(s1[i].equals("C")&&(s1[i+1].equals("D")||s1[i+1].equals("M")))
        	{m=m-200;}
if(s1[i].equals("D")&&(s1[i+1].equals("M")))
        	{m=m-1000;}
        	}
        	
        	switch(s1[i])
        	{
        		case("I"):
        		{
        		m=m+1;
        			break;
        		}
        		case("V"):
        		{
        			m=m+5;
        			break;
        		}
        		case("X"):
        		{
        			m=m+10;
        			break;
        		}
        		case("L"):
        		{
        			m=m+50;
        			break;
        		}
        		case("C"):
        		{
        			m=m+100;
        			break;
        		}
        		case("D"):
        		{
        			m=m+500;
        			break;
        		}
        		case("M"):
        		{
        			m=m+1000;
        			break;
        		}
        		default:
        		{
        			System.out.println("Invalid input");
        		}
     }}
		System.out.println(m);}}
