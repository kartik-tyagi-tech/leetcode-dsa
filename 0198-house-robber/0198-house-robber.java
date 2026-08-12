class Solution {
    public int rob(int[] nums) {
        int prev1 =0;
        int prev2 =0;
        for(int each:nums){
            int sum=Math.max(prev1,prev2+each);
            prev2=prev1;
            prev1=sum;
        }
        return prev1;
    }
}