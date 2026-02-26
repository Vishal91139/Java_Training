package Day_04.Accociation.Composition;

class Engine{
    void start() {
        System.out.println("Engine starts!");
    }
}

public class Car {
    private Engine engine;
    Car() {
        //Engine class onject will be created here
        engine = new Engine();
    }
    
    void Drive() {
        engine.start();
        System.out.println("Car is moving!");
    }

    public static void main(String[] args){
        Car car = new Car();
        car.Drive();
    }
}
