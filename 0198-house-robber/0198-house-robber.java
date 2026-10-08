class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1) return nums[0];
        int last = 0;
        int secondLast = 0;

        int pick = 0;
        int notPick = 0;

        int result =0;

        for(int i =0;i<=nums.length-1;i++){
              pick = secondLast + nums[i];
              notPick = last;

              result = Math.max(pick,notPick);
              secondLast = last;
              last = result;
        }
           return result;
    }
}