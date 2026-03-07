package DAY_09.collections.lambdaExpressions;

import java.util.*;

class Student{
    int id;
    String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(121, "Vishal kumar"));
        list.add(new Student(126, "Yashas"));
        list.add(new Student(118, "Varada"));
        Collections.sort(list,(s1,s2) -> s1.id - s2.id);
        for(Student s : list){
            System.out.println(s.id+ " "+s.name);
        }
    }
}
