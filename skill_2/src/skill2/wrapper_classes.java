package skill2;
import java.util.*;
public class wrapper_classes {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		    
		        int a = sc.nextInt(); 
		        Integer wrapperA = Integer.valueOf(a);
		        int b = wrapperA; 

		        System.out.println("Primitive: " + a);
		        System.out.println("Wrapper (Boxed): " + wrapperA);
		        System.out.println("Unboxed: " + b);
		    }
		}