package Day_04.Interfaces;

interface interfaceConcepts {
    void display();
}

class A {
    
}

class B {
public static void main(String[] args) {
        A a = new A();
        B b = new B();

        //Old java code - Boring Code : Boilerplate Code
        interfaceConcepts obj = new interfaceConcepts(){
            public void display() {
                System.out.println("Hello");
            }
        };

        // java 8 or 1.8 : lambda Expression
        interfaceConcepts obj1 = () -> System.out.println("Hello");

    }
}

