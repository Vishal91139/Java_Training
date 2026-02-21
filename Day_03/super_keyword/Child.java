package Day_03.super_keyword;

public class Child extends Parent{
    int x = 20;

    void show() {
        super.print();
        System.out.println(x + " its from child class");
        System.out.println(super.x + " is from parent class");
    }

    public static void main(String[] args){
        Child ob = new Child();
        ob.show();
    }
}
