package Day_05.exceptions;

public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 10;
        try {
            k = i/j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[9]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            e.printStackTrace(); // details
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
             System.out.println("end of execution");
            System.out.println("turn of DB");
            System.out.println("turn of Internet");
            System.out.println("turn of Files");
        }
            System.out.println("The value of k: "+ k);
    }
    static {
        System.out.println("started execution");
        System.out.println("Load DB");
        System.out.println("Load Internet");
        System.out.println("Load Files");
    }
}
