package skill_3;
import java.util.*;
public class sum_average_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter array size: ");
		        int n = sc.nextInt();

		        int[] arr = new int[n];
		        int sum = 0;

		        System.out.println("Enter array elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		            sum += arr[i];
		        }

		        double avg = (double) sum / n;
		        System.out.println("Sum: " + sum);
		        System.out.println("Average: " + avg);
		    }
		

	}