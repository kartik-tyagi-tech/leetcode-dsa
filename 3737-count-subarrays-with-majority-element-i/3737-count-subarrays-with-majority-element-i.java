class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;

        for (int start = 0; start < n; start++) {
            int freq = 0;

            for (int end = start; end < n; end++) {
                if (nums[end] == target) {
                    freq++;
                }

                int len = end - start + 1;

                if (freq > len / 2) {
                    ans++;
                }
            }
        }

        return ans;
    }
}