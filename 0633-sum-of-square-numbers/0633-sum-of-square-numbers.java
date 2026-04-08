class Solution {
    public boolean judgeSquareSum(int c) {
        // Use long to prevent overflow during intermediate calculations (a*a + b*b)
        long left = 0;
        long right = (long) Math.sqrt(c);
        
        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
