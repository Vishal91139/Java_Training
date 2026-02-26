package Day_04.Interfaces;

public interface Animal {
    /*
    Interface methods are completely abstract and cannot have a body
    They are implemented in the respective child classes
    Therefore, interfaces exhbit 100% abstraction 
    */
   void sound();
   void run();
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
    @Override
    public void run() {
        System.out.println("Cats run fast.");
    }
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
    @Override
    public void run() {
        System.out.println("Dogs run fast.");
    }
}

class Demo {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.run();
        cat.sound();
        dog.run();
        dog.sound();
    }
}
