package lab_1;

import java.util.Scanner;

public class  Volume_of_a_Sphere  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();
        double volume = 4/3*3.14*radius*radius*radius;
        System.out.printf("The volume of the sphere is: %.2f\n", volume);
    }
}
