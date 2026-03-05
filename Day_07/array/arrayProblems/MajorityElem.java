package Day_07.array.arrayProblems;

public class MajorityElem {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,2,2,2,1,1};
        int count = 0;
        int candidate = 0;
        for(int i=0; i<arr.length; i++){
            if(count == 0){
                candidate = arr[i];
            }
            if(candidate == arr[i]) count++;
            else count--;
        }
        System.out.print("The majority element is : "+candidate);
    }
}
