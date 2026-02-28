package Day_06.arrays;

public class E4 {
    // Passing array into methods
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] createArray(){
        return new int[]{10,20,30};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);

        printArray(createArray());
        // Anonymous array -> we dont have a reference / object
        // After the method call, we can never access it.
        printArray(new int[]{100,200,300});
    }
}
