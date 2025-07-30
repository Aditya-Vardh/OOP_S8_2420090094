package lab_2;

import java.util.Scanner;

public class Character_is_an_Alphabet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet");
        } else {
            System.out.println(ch + " is NOT an alphabet");
        }
    }
}
