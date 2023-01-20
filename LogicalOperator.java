package Assignment5;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8,b=4;
		// && operator
	    System.out.println((a > b) && (a > b));  // true
	    System.out.println((a> b) && (a< b));  // false

	    // || operator
	    System.out.println((a < b) || (a > b));  // true
	    System.out.println((a > b) || (a < b));  // true
	    System.out.println((a < b) || (a < b));  // false

	    // ! operator
	    System.out.println(!(a==b));  // true
	    System.out.println(!(a> b));  // false
	  }
}
