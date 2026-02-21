package Day_03.Inheritance;

public class Main {
    public static void main(String[] args){
        Cat ob = new Cat();
        ob.meow(); // from cat
        ob.sound(); // from Animal

        Dog ob1 = new Dog();
        ob1.sound();  // from Animal
        ob1.barks();  // from dog
    }
}
