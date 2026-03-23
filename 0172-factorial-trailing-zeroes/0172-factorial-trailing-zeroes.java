class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        if(n<5){
            return count;
        }
        for(int i=5;i<=n;i=i*5){
                  count+=n/i;
        }
        return count;
    }
}