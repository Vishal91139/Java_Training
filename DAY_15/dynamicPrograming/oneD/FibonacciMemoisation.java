package DAY_15.dynamicPrograming.oneD;

public class FibonacciMemoisation {
    public static int fib(int n, int[] dp){
        // base case
        if(n <= 1) return n;
        // step 2: if you have value dont calculate, just return
        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = fib(n-1, dp) + fib(n-2, dp);
    }

    public static void main(String args[]){
        int n = 6;
        // step 1 : create a 1d dp table of size n+1 (0-based)
        int[] dp = new int[n+1]; // 0-based indexing
        // sub step of 1: fill the array with default values -1
        
    }
}
