class Solution {
    public static int countSum(int n){
        int sum=0;
      while(n>0){
                int k=n%10;
                sum+=k;
                n=n/10;
      }
      return sum;
    }
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int each:nums){
            min=Math.min(min,countSum(each));

        }
        return min;
    }
}