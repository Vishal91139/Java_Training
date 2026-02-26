package Day_04.Inheritance;

interface sports {
    void play();
}

class Person {
    String name;
    Person(String name){
        this.name = name;
    }
}

public class Student extends Person implements sports {
    Student(String name) {
        super(name); // here we call the parent class constructor
    }

    @Override
    public void play() {
        System.out.println(name + " plays football");
    }
}

class Demo1 {
    public static void main(String[] args){
        Student student = new Student("Vishal");
        student.play();
    }
}
