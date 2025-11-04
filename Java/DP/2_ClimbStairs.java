// Problem Description

// You are climbing a staircase and it takes A steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
// Return the number of distinct ways modulo 1000000007

//Input A = 2, Output A = 2
//Input A = 3, Output A = 3
public class Solution {
    public int climbStairs(int A) {
        int dp[] = new int[A+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;

        return findSteps(A, dp);
    }

     //1st approach - Recursion
     public static int findSteps(int A, int []dp) {
        if(dp[A] != -1) {
            return dp[A];
        }
        return dp[A] = ((findSteps(A-1, dp))%1000000007 + (findSteps(A-2, dp)%1000000007))%1000000007;
    }

   //2nd approach - Tabulation
      public static int findSteps(int A, int []dp) {
        for(int i=2; i<=A; i++){
          dp[i] = dp[i-1]%1000000007 + dp[i-2]%1000000007;
        }
        return dp[A]%1000000007;
    }
}
