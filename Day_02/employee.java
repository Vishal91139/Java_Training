public class employee {
    int id;
    String name;
    double salary;

    employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Id: "+id+"\n"+"Name: "+name+"\n"+"Salary: "+salary+"\n");
    }

    public static void main(String[] args) {
        employee em = new employee(121,"Vishal", 10000);
        employee em1 = new employee(122,"kumar", 20000);
        em.display();
        em1.display();
    }
}
