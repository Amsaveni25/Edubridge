package Assignment4;
import java.util.Scanner;

public class Program10 {
	
	public static void main(String[] args) {
	int sum;
	Scanner obj =new Scanner(System.in);

	int ch;
	do {
	System.out.print("Enter the first number:");
	int num1=obj.nextInt();
	System.out.print("Enter the first number:");
	int num2=obj.nextInt();
	sum=num1+num2;
	System.out.println("Sum of two number:"+sum);
	System.out.print("If you want to continue the operation print Y/N:");
	ch=obj.nextInt();
	}while((ch==1)||(ch==2));
	}
	}


