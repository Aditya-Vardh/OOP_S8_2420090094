package skill_3;
import java.util.*;
public class add_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter rows and columns: ");
		        int rows = sc.nextInt();
		        int cols = sc.nextInt();

		        int[][] a = new int[rows][cols];
		        int[][] b = new int[rows][cols];
		        int[][] sum = new int[rows][cols];

		        System.out.println("Enter first matrix:");
		        for (int i = 0; i < rows; i++)
		            for (int j = 0; j < cols; j++)
		                a[i][j] = sc.nextInt();

		        System.out.println("Enter second matrix:");
		        for (int i = 0; i < rows; i++)
		            for (int j = 0; j < cols; j++)
		                b[i][j] = sc.nextInt();

		        System.out.println("Sum matrix:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                sum[i][j] = a[i][j] + b[i][j];
		                System.out.print(sum[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		
	}