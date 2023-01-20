package Assignment4;
import java.util.Scanner;

public class HcfOfTwoNumbers {
		   public static void main(String args[]){
		      int num1, num2, i, hcf = 0;
		      Scanner scanner = new Scanner(System.in);
		      System.out.println("Enter first number :: ");
		      num1= scanner.nextInt();
		      System.out.println("Enter second number :: ");
		      num2= scanner.nextInt();

		      for(i = 1; i <= num1|| i <= num2; i++) {
		         if( num1%i == 0 && num2%i == 0 )
		         hcf = i;
		      }
		      System.out.println("HCF of given two numbers is ::"+hcf);
		   }
		
}