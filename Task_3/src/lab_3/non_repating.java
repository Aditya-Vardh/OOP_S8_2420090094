package lab_3;

import java.util.Scanner;

public class non_repating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("No non-repeating character found");
        sc.close();
    }
}
