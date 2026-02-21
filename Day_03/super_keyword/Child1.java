package Day_03.super_keyword;

class parent {
    parent() {
        System.out.println("Parent");
    }
}

public class Child1 extends parent {
    Child1(){
        super();
        System.out.println("Child");
    }

    public static void main(String[] args){
        Child1 ob = new Child1();
    }
}
