import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public void func(int[] candidates, int i, int sum, List<Integer> v, List<List<Integer>> result) {
        // Base case: if sum is zero, we've found a valid combination
        if (sum == 0) {
            result.add(new ArrayList<>(v));  // Add the current combination to the result
            return;
        }

        // If sum becomes negative or we have processed all elements, return
        if (sum < 0 || i >= candidates.length) {
            return;
        }

        // Try to include each element starting from index i
        for (int j = i; j < candidates.length; j++) {
            // Skip duplicates: If the current element is the same as the previous one, skip it to avoid duplicates
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }

            // Include the current element and recurse
            v.add(candidates[j]);
            func(candidates, j + 1, sum - candidates[j], v, result);  // Recurse with the updated sum
            v.remove(v.size() - 1);  // Backtrack: remove the last element to explore other combinations
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Sort the array first to handle duplicates
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> v = new ArrayList<>();

        func(candidates, 0, target, v, result);  // Start recursion
        return result;

        
    }
}
