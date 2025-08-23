package lab_5;

import java.util.Scanner;

class Order {
    String orderId;
    double amount;
    Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }
    public void printDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: Rs:" + amount);
    }
}
class OnlineOrder extends Order {
    String deliveryAddress;
    OnlineOrder(String orderId, double amount, String deliveryAddress) {
        super(orderId, amount);
        this.deliveryAddress = deliveryAddress;
    }
    public void printDetails() {
        super.printDetails(); 
        System.out.println("Delivery Address: " + deliveryAddress);
    }
}
public class price_details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Delivery Address: ");
        String address = sc.nextLine();
        OnlineOrder order = new OnlineOrder(id, amt, address);
        order.printDetails();
        sc.close();
    }
}
