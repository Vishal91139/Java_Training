// Constructor

public class student {
    String name;
    int age;

    student(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println(name+ " "+age);
    }

    public static void main(String[] args){
        student sc = new student("Vishal", 20);
        sc.display();
    }
}
