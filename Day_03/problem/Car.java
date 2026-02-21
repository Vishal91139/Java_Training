package Day_03.problem;

public class Car extends Vehicle {
    void speed(String mode){
        System.out.println("Its in "+mode+" mode");
    }

    public static void main(String[] args){
        Car car = new Car();
        car.speed();
        car.speed(200);
        car.speed("sports");
    }
}
