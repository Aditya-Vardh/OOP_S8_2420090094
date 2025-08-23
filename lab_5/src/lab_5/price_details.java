package lab_5;

class Order {
    public void printDetails() {
        System.out.println("Order details vary.");
    }
}
class OnlineOrder extends Order {
    public void printDetails() {
        System.out.println("Order ID: 101");
        System.out.println("Amount: Rs.1000");
        System.out.println("Delivery Address: Hyderabad");
    }
}
public class price_details {
    public static void main(String[] args) {
        Order o1 = new Order();
        Order o2 = new OnlineOrder();
        o1.printDetails();
        o2.printDetails();
    }
}
