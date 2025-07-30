package skill_1;

import java.util.Scanner;

public class student_dashboard_module {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll Number (long): ");
        long rollNumber = scanner.nextLong();
        scanner.nextLine(); 

        System.out.print("Enter Name (String): ");
        String name = scanner.nextLine();

        System.out.print("Enter Marks (float): ");
        float marks = scanner.nextFloat();

        System.out.print("Enter Gender (char): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Is the student Pass? (true/false): ");
        boolean isPassed = scanner.nextBoolean();

        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        System.out.println("Gender      : " + gender);
        System.out.println("Pass Status : " + (isPassed ? "Pass" : "Fail"));
    }
}
