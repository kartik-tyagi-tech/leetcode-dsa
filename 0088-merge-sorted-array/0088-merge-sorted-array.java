class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0) {
            for(int i =0;i<nums2.length;i++){
                nums1[i]=nums2[i];
            }
        }

        else{
                  int start=m;
        for(int i=0;i<nums2.length;i++){
            nums1[start]=nums2[i];
            start++;
        }
        }
            
        
        Arrays.sort(nums1);
    }
}