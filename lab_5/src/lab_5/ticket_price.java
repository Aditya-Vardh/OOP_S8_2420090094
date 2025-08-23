package lab_5;
class transport {
    public void ticket() {
        System.out.println("Ticket price varies depending on the transport type.");
    }
}
class bus extends transport {
    public void ticket() {
        System.out.println("Bus ticket price is: 50 Rs");
    }
}
class train extends transport {
    public void ticket() {
        System.out.println("Train ticket price is: 500 Rs");
    }
}
public class ticket_price {

  public static void main(String[] args) {
    transport t1=new bus();
    transport t2=new train();
    t1.ticket();
    t2.ticket();             
  }

}