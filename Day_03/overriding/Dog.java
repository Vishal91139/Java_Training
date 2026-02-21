package Day_03.overriding;

class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args){
        Animal obj = new Dog();
        obj.sound();
    }
}
