package skill2;
import java.util.*;
public class typeconvenstions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		   
		        Scanner sc = new Scanner(System.in);

		     
		        System.out.print("Enter an integer: ");
		        int intVal = sc.nextInt();
		        double doubleVal = intVal;
		        System.out.println("Implicit Conversion (int to double): " + doubleVal);

		    
		        System.out.print("Enter a double value: ");
		        double d = sc.nextDouble();
		        int i = (int) d;
		        System.out.println("Explicit Conversion (double to int): " + i);
		    }
		

	}