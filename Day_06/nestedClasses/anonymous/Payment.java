package Day_06.nestedClasses.anonymous;

public interface Payment {
    void pay();
}
class PaymentDemo {
    public static void main(String[] args) {
        // Boilerplate code
        Payment p = new Payment(){
            public void pay(){
                System.out.println("Payment done using credit card");
            }
        };
        p.pay();
        // SCALA - Java 8 (Streams, Annotation, Lambdas, reflection)
        Payment p1 = () -> System.out.println("Cash Payment");
        p1.pay();
    }
}
/*
ℹ️Points to remember:
⭐ One - time implementation
⭐ No need to create seperate class
⭐ it is used in events and callback functions
*/