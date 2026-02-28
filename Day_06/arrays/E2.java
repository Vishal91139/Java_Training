package Day_06.arrays;

public class E2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1] = 40;
        System.out.println(arr[1]);
        /*
        Accces and update elements in an array -> TC O(1)
        This is because of index based access or
        direct index maping
        [idx = pos-1] or [pos = idx+1]
        */

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
        
        for(Object o : arr){
            System.out.print(o + " ");
        }
        System.out.println();

        String name = "JAVA";
        System.out.println(name.length());
    }
    /*
    ☑️ ayyay.length is a property
    ☑️ string.length() is a method

    ℹ️ Memory management:
    ⭐ Array object is stored in the heap
    ⭐ Variable reference is stored in the stack
    ⭐ Elements are stored in contiguous memory blocks
    
    🟢 char[1][1][1][1] int[4][4][4][4] double[8][8][8][8] bytes
    */
}
