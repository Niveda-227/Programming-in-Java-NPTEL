Consider First n even numbers starting from zero(0).Complete the code segment to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.
  
import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
         
//Use for or while loop do the operation.
int c=0;
for(int a=0;c<n;a+=2)
{
  c++;
  if(a%3==0)
  {
    sum=sum+a;
  }
}
  System.out.println(sum);
