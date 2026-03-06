package Day_07.DSA.algos.searching.binarySearchApplications;

public class SquareRootBinarySearch {
    public static int sqrt_bs(int n){
        int s = 0;
        int e = n;
        int ans = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            int square = mid*mid;
            if(square == n){
                return mid;
            } else if(square > n){
                e = mid - 1;
            } else {
                // store the probable answer and move to the right
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println("The square root of "+n+" is: "+sqrt_bs(n));
    }
}
