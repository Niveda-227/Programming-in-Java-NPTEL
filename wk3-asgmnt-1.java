import java.util.Scanner;
public class Fibonacci { 

public static void main(String args[]){ 
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
System.out.println(fib(n)); 
} 
//Template code:
static int fib(int n) { 


        if (n==1)      //Terminal condition
            return 0;
        else if(n==2)
            return 1; 			
return fib(n - 1) + fib(n - 2); //Recursive call of function 

}
}
