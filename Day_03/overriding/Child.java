package Day_03.overriding;

class parent {
    void show() {
        System.out.println("Parent static method");
    }
}

public class Child extends parent {
    @Override
    void show() {
        System.out.println("child static method");
    }

    public static void main(String[] args){
        parent obj = new Child();
        obj.show();
    }
}
