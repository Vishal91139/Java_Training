package Day_07.DSA.algos.special;

public class KadaneAlgo {
    static int kadaneAlgo(int[] arr){
        int cMax = 0;
        int gMax = 0;
        for(int i=1; i<arr.length; i++){
            cMax = Math.max(arr[i], cMax+arr[i]);
            gMax = Math.max(cMax,gMax);
        }
        return gMax;
    }

    public static void main(String[] args) {
        int[] arr = {5,-8,1,2,-1,4};
        System.out.println(kadaneAlgo(arr));
    }
}
