class Solution {
    
    public int minOperations(int[] nums, int[] numsDivide) {
        int gcd = numsDivide[0];
        
        for (int i = 1; i < numsDivide.length; i++) {
            gcd = findGCD(gcd, numsDivide[i]);
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (gcd % nums[i] == 0) {
                return i;
            }
        }
        
        return -1;
    }
    
    private int findGCD(int a, int b){
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}
