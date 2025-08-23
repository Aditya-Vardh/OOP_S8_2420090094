package lab_5;

import java.util.Scanner;
class Transport {
    public void ticketPrice() {
        System.out.println("Transport ticket price varies.");
    }
}
class Bus extends Transport {
    public void ticketPrice() {
        System.out.println("Bus ticket price: Rs:50/-");
    }
}
class Train extends Transport {
    public void ticketPrice() {
        System.out.println("Train ticket price: Rs:100/-");
    }
}
public class ticket_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (bus/train): ");
        String choice = sc.nextLine().toLowerCase();
        Transport t;
        if (choice.equals("bus")) {
            t = new Bus();
        } else if (choice.equals("train")) {
            t = new Train();
        } else {
            t = new Transport();
        }
        t.ticketPrice();
        sc.close();
    }
}
