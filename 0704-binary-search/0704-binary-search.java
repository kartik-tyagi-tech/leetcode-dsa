class Solution {
    public int search(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
       if (low==high && target==nums[low]) return low;
        while(low<high)
        {
             int mid =( low + high )/2;
if(nums[low]==target){
    
    return low;}
    else if (nums[high]==target) return high;
    else if (nums[mid]==target) return mid;
    else if (nums[mid]>target) high =mid -1;
    else low =mid +1;

        }
        return -1;
    }
}