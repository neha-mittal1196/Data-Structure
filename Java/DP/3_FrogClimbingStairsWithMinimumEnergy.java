// A frog wants to climb a staircase with n steps. Given an integer array heights, where heights[i] contains the height of the ith step.
// To jump from the ith step to the jth step, the frog requires abs(heights[i] - heights[j]) energy, where abs() denotes the absolute difference. 
// The frog can jump from any step either one or two steps, provided it exists.
// Return the minimum amount of energy required by the frog to go from the 0th step to the (n-1)th step.

// Input: heights = [2, 1, 3, 5, 4]

// Output: 2

// Explanation:
// One possible route can be,
// 0th step -> 2nd Step = abs(2 - 3) = 1
// 2nd step -> 4th step = abs(3 - 4) = 1

// Total = 1 + 1 = 2.

// Input: heights = [7, 5, 1, 2, 6]
// Output: 9

// Explanation:
// One possible route can be,
// 0th step -> 1st Step = abs(7 - 5) = 2
// 1st step -> 3rd step = abs(5 - 2) = 3
// 3rd step -> 4th step = abs(2 - 6) = 4
// Total = 2 + 3 + 4 = 9.


class Solution {
    int dp [] ;
    public int frogJump(int[] heights) {
        int n = heights.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        return minEnergy(n-1, heights);
    }

  //1st approach - Recursion
    // public int minEnergy(int n, int heights[]) {
    //     if(n == 0) {
    //         return 0;
    //     }

    //     if(dp[n] != -1) {
    //         return dp[n];
    //     }

    //     int fs = minEnergy(n-1, heights) + Math.abs(heights[n] - heights[n-1]);
    //     int ss = Integer.MAX_VALUE;
    //     if(n > 1) {
    //         ss = minEnergy(n-2, heights) + Math.abs(heights[n] - heights[n-2]);
    //     }
    //     return dp[n] = Math.min(fs, ss);
    // }

   //2nd approach - Tabulation

    public int minEnergy(int n, int heights[]) {
      
        int ss = Integer.MAX_VALUE;
        for(int i=1; i< n; i++) {
            int fs = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
            if(n > 1) {
                ss = dp[i-2] + Math.abs(heights[i] - heights[i-2]);
            }

            dp[i] = Math.min(fs, ss);
        }
        return dp[n-1];
    }
}
