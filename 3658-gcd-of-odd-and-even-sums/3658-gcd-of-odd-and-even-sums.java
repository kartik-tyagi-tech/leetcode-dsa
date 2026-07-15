class Solution {
    int gcd(int num1, int num2){
        if(num1%num2==0) return num2;
        else {
            return gcd(num2%num1,num1);
        }
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        for(int i =1;i<=2*n;i++){
            if(i%2==0) sumEven+=i;
            else sumOdd+=i;
        }
        return gcd(sumOdd,sumEven);
    }
}