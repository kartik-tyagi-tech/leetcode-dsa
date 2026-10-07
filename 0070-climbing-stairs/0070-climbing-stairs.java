// 1. Try to represent any problems in terms of index
// 2. Do all possible stuffs on that index, according to the problem statement
// 3. Sum of all stuffs ->count all the ways , min(of all stuffs) -> Find min



// class Solution {
//     public int climbStairs(int n) {
//         if(n==0) return 0;
//         if(n==1) return 1;
//         if(n==2) return 2;

//         return climbStairs(n-1)+climbStairs(n-2);
//     }
// }


// class Solution {
//     public int climbStairs(int n) {
//         if (n <= 2) return n;
        
//         int[] dp = new int[n + 1];
//         dp[1] = 1;
//         dp[2] = 2;
        
//         for (int i = 3; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }
        
//         return dp[n];
//     }
// }

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int twoStepsBack = 1;
        int oneStepBack = 2;
        
        for (int i = 3; i <= n; i++) {
            int current = oneStepBack + twoStepsBack;
            twoStepsBack = oneStepBack;
            oneStepBack = current;
        }
        
        return oneStepBack;
    }
}


