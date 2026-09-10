class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive[]=new int[nums.length/2];
        int negative[]=new int[nums.length/2];
        int result[]=new int[nums.length];
        int j=0;
        int k=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>0){
                positive[j]=nums[i];
                j++;
            }
            else{
                negative[k]=nums[i];
                k++;
            }
        }
        int l=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                
                result[i]=positive[l];
                l++;
                
            }
            else{
                
                result[i]=negative[m];
                m++;
            }
        }
        return result;
    }
}