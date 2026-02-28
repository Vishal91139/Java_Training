package Day_06.arrays;

class Student {
    String name;
    int usn;
}

class Intern {
    String name;
    int id;
    Intern(String name, int id){
        this.name = name;
        this.id = id;
    }
}

//Array of Objects {Student Object}
public class E7 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student();
        students[0].name = "Vishal";
        students[0].usn = 121;
        System.out.println(students[0].name+ " "+students[0].usn);

        Intern[] interns = new Intern[]{
            new Intern("vishal",121),
            new Intern("kumar",122),
            new Intern("Bishal",120),
        };
        // the datatype is the class itself
        for(Intern i : interns){
            System.out.println(i.name+" "+i.id);
        }
    }
}
