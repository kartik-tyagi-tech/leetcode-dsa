class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
             
             int i=0;
        while(i < nums.length-2) {
            
            int j = i + 1;
            int k = nums.length - 1;
            int temp1=nums[i];
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    temp1=nums[i];
                    int temp2 = nums[j];
                    int temp3 = nums[k];

                    while (j <= nums.length - 1 && k >= 0 && nums[j] == temp2 && nums[k] == temp3) {
                        k--;
                        j++;
                    }
                } else if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                }

            }
            
            while(i < nums.length-2 && nums[i]==temp1){
                  i++;
            }
            
            
        }

        return list;
    }
}