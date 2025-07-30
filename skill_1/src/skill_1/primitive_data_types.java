package skill_1;

import java.util.Scanner;

public class primitive_data_types{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter person's age (byte): ");
        byte age = scanner.nextByte();

        System.out.print("Enter current year (short): ");
        short currentYear = scanner.nextShort();

        System.out.print("Enter country population (int): ");
        int population = scanner.nextInt();

        System.out.print("Enter distance from Earth to Moon in meters (long): ");
        long distanceToMoonMeters = scanner.nextLong();

        System.out.print("Enter value of Pi (float): ");
        float pi = scanner.nextFloat();

        System.out.print("Enter acceleration due to gravity (double): ");
        double gravity = scanner.nextDouble();

        System.out.print("Enter student's grade (char): ");
        char studentGrade = scanner.next().charAt(0);

        System.out.print("Is Java fun to learn? (true/false) (boolean): ");
        boolean isJavaFun = scanner.nextBoolean();

        System.out.println("\n-- Entered Values --");
        System.out.println("Person's age (byte): " + age);
        System.out.println("Current year (short): " + currentYear);
        System.out.println("Country population (int): " + population);
        System.out.println("Distance from Earth to Moon (meters) (long): " + distanceToMoonMeters);
        System.out.println("Value of Pi (float): " + pi);
        System.out.println("Acceleration due to gravity (double): " + gravity);
        System.out.println("Student's grade (char): " + studentGrade);
        System.out.println("Is Java fun to learn? (boolean): " + isJavaFun);

    }
}
