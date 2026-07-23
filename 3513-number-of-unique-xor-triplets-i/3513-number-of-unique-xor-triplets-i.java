class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n<3) return n;
        if(n>=3){
            for(int i =0;i<n;i++){
                if(Math.pow(2,i)>n) return (int) Math.pow(2,i);
            }
        }
        return -1;
    }
}