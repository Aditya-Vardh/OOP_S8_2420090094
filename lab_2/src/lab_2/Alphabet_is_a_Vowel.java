package lab_2;

import java.util.Scanner;

public class Alphabet_is_a_Vowel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') || (ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is NOT a Vowel.");
        }
    }
}
