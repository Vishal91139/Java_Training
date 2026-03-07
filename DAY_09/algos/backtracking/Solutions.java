package DAY_09.algos.backtracking;

import java.util.*;

public class Solutions {
    private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans){
        // Base case
        if(index >= nums.length){
            ans.add(new ArrayList<>(output)); // Add a copy of the subset
            return;
        }
        // Exclude Case
        solve(nums, output, index+1, ans);
        // Include case
        output.add(nums[index]); //Store that value and move to next index
        solve(nums, output, index+1, ans);
        // Backtrack and remove the last answer from the output to go to next
        output.remove(output.size()-1);
    }

    public List<List<Integer>> subset(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums,output,index,ans);
        return ans;
    }

    public static void main(String[] args) {
        Solutions solution = new Solutions();
        int[] nums = {1,2,3};
        List<List<Integer>> result = solution.subset(nums);
        for(List<Integer> subset : result){
            System.out.println(subset);
        }
    }
}
