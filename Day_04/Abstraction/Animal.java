package Day_04.Abstraction;

abstract class Animal {
    // Normal or concrete Methods
    // Abstact Methods
    void eat() {
        System.out.println("Animals eat some food!");
    }
    // this method cannot have a body
    // it will be implementes in the child classes
    abstract void run();
    // If an abstarct class has only abstract methods
    //it is 100% abstraction
    // if it has even 1 normal - it is not 100%
}

class Cat extends Animal {
    @Override
    void run(){
        System.out.println("Cats run fast");
    }
}

class Cheetah extends Animal {
    @Override
    void run(){
        System.out.println("Cheetah runs very fast");
    }
}

class Demo {
    public static void main(String[] args){
        Cat cat = new Cat();
        Cheetah cheetah = new Cheetah();
        cat.eat();
        cat.run();
        cheetah.eat();
        cheetah.run();
    }
}