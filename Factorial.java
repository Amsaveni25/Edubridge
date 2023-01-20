package Assignment4;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
int count=1;
Scanner obj = new Scanner(System.in);
System.out.println("Enter the number for factorial Value :");
int num = obj.nextInt();
for(int i=1;i<=num;i++) {
//count=i;
count*=i;
}
System.out.print("Factorail value of"+" "+num+" "+"is"+" "+count);
}
}
