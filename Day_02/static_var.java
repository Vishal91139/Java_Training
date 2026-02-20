public class static_var {
    static int count = 0; // here if static is not present then restart for new object
    
    int id;

    static_var(){
        count++;
        id = count;
        System.out.println("Object Id: "+id);
    }

    public static void main(String[] args){
        static_var ob = new static_var();
        static_var ob1 = new static_var();
        static_var ob3 = new static_var();
        System.out.println("The total counter run is: "+count);
    }
}
