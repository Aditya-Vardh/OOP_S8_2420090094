package skill2;
import java.util.*;
public class operators {

	public static void main(String[] args) {

		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number (a): ");
		        int a = sc.nextInt();

		        System.out.print("Enter second number (b): ");
		        int b = sc.nextInt();

		    
		        System.out.println("Addition: " + (a + b));
		        System.out.println("Subtraction: " + (a - b));
		        System.out.println("Multiplication: " + (a * b));
		        System.out.println("Division: " + (a / b));
		        System.out.println("Modulus: " + (a % b));

		        System.out.println("a > b: " + (a > b));
		        System.out.println("a == b: " + (a == b));

		        System.out.println("(a > 5 && b < 10): " + (a > 5 && b < 10));
		        System.out.println("(a < 5 || b < 10): " + (a < 5 || b < 10));

		      
		        a += 2;
		        System.out.println("a after a += 2: " + a);
		    }
		

	

}