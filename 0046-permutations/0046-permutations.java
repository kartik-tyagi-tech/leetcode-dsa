import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        // Base case: permutation complete
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int num : nums) {
            // Skip if already used
            if (tempList.contains(num)) continue;

            tempList.add(num);             // Choose
            backtrack(result, tempList, nums); // Explore
            tempList.remove(tempList.size() - 1); // Undo (backtrack)
        }
    }
}