class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        // Case 1: Rob from 0 to n-2
        int case1 = robLinear(nums, 0, n - 2);

        // Case 2: Rob from 1 to n-1
        int case2 = robLinear(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    private int robLinear(int[] nums, int start, int end) {

        int last = 0;
        int secondLast = 0;

        for (int i = start; i <= end; i++) {

            int pick = secondLast + nums[i];
            int notPick = last;

            int result = Math.max(pick, notPick);

            secondLast = last;
            last = result;
        }

        return last;
    }
}