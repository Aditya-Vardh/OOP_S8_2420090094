package lab_2;

import java.util.Scanner;

public class Perfect_Number_Checker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num && num != 0) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is NOT a perfect number.");
        }

    }
}
