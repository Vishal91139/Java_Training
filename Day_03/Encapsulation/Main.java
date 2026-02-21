package Day_03.Encapsulation;

public class Main {
    public static void main(String[] args){
        Student obj = new Student("Vishal", 20);
        System.out.println(obj.getname());
        
        obj.setname("Vishal kumar");
        System.out.println(obj.getname());
    }
}
