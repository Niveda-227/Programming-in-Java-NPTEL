//A positive number is called an Armstrong number if it is equal to the sum of cubes of its digits for example 153 = 1^3+5^3+3^3, 370, 371, 407, etc.

import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
      
//Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.
int rem=0;
int dummy=n;
while(n>0)
{
  rem=n%10;
  result=result+(rem*rem*rem);
  n=n/10;
}
if(dummy==result)
{
  System.out.println("1");
}
else
{
  System.out.println("0");
}
