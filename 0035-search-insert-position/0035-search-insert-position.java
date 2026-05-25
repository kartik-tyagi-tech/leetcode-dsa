class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        
        if(target>nums[nums.length-1]) return nums.length;
        if(target<=nums[0]) return 0;


        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) right--;
            else left++;
        }
        while(left<right && right!=left+1){
            int mid=left+(right-left)/2;
            if(nums[mid]>target) right=mid;
            else left=mid;
        }
        return left;
    }
}