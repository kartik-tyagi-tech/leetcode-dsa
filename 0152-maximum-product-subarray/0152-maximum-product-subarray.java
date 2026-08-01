class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
       
        int product =Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            int tempProduct = 1;
            for(int j = i;j<n;j++){
                 tempProduct*=nums[j];
                 product=Math.max(product,tempProduct);
            }
        }
        return product;
    }
}