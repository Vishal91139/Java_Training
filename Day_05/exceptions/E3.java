package Day_05.exceptions;

public class E3 {
    static void checkAge(int age){
        if(age >= 18){
            System.out.println("Eliglble - Access Granted");
        } else {
            throw new RuntimeException("Not eligible - Access Denied");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}
