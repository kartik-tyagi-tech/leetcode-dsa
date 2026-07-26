class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        int i = 0;

        while (i < n - 3) {

            int j = i + 1;

            while (j < n - 2) {

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {

                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);

                        result.add(list);

                        int tempLeft = nums[left];
                        int tempRight = nums[right];

                        while (left < right && nums[left] == tempLeft)
                            left++;

                        while (left < right && nums[right] == tempRight)
                            right--;
                    }

                    if (sum < target) {
                        int tempLeft = nums[left];

                        while (left < right && nums[left] == tempLeft)
                            left++;
                    }

                    if (sum > target) {
                        int tempRight = nums[right];

                        while (left < right && nums[right] == tempRight)
                            right--;
                    }
                }

                int tempJ = nums[j];
                while (j < n - 2 && nums[j] == tempJ)
                    j++;
            }

            int tempI = nums[i];
            while (i < n - 3 && nums[i] == tempI)
                i++;
        }

        return result;
    }
}