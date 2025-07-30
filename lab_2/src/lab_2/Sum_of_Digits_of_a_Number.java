package lab_2;

import java.util.Scanner;

public class Sum_of_Digits_of_a_Number {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number\n");
 int num=sc.nextInt();
 int sum=0;
 while(num!=0) {
	 int digit=num%10;
	 sum=digit+sum;
	 num=num/10;
 }
 System.out.println("sum of digit is :"+sum);
	}
}
