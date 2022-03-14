import java.io.*;
import java.util.*;

public class Question4{  
    public static void main(String[] args) { 
	  int c=0;
         try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();
           
//Write your code here to count the number of vowels in the string "s1"
for(int a=0;a<s1.length();a++)
     {  
          char str=s1.charAt(a);
          if(str=='e' || str=='E'|| str=='a' || str=='A' || str=='i' || str=='I' || str=='o' || str=='O' || str=='u' || str=='U') 
	     {
	       c=c+1;
         }  
     } 

 System.out.println(c); 
	   }
       catch (Exception e){
		 System.out.println(e);
	    }	   
    }  
}            
