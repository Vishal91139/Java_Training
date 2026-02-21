package Day_03.Inheritance;

public class puppy extends Dog {
    void display() {
        System.out.println("Puppy class");
    }

    public static void main(String[] args ){
        puppy ob = new puppy();
        ob.display();
        ob.barks();
        ob.sound();
    }
}
