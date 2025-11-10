//A frog wants to climb a staircase with n steps. Given an integer array heights, where heights[i] contains the height of the ith step, and an integer k.
//To jump from the ith step to the jth step, the frog requires abs(heights[i] - heights[j]) energy, where abs() denotes the absolute difference. 
//The frog can jump from the ith step to any step in the range [i + 1, i + k], provided it exists.
//Return the minimum amount of energy required by the frog to go from the 0th step to the (n-1)th step.


// Examples:
// Input: heights = [10, 5, 20, 0, 15], k = 2
// Output: 15

// Explanation:
// 0th step -> 2nd step, cost = abs(10 - 20) = 10
// 2nd step -> 4th step, cost = abs(20 - 15) = 5
// Total cost = 10 + 5 = 15.

class Solution {
    int dp[];
    public int frogJump(int[] heights, int k) {
        int n = heights.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        return minEnergy(n-1, k, heights);
    }

   //1st approach - recursive
    public int minEnergy(int n, int k ,int [] heights){
        if(dp[n] != -1) {
            return dp[n];
        }

        int minEnergy = Integer.MAX_VALUE;
        for(int i=1; i<=k ; i++) {
            if(n-i >= 0) {
                int energy = minEnergy(n-i, k, heights) + Math.abs(heights[n] - heights[n-i]);
                minEnergy = Math.min(minEnergy, energy);
            }
        }

        return dp[n] = minEnergy;
        
    }

   //2nd approach - Tabulation
    public int minEnergy(int n, int k ,int [] heights){
        for(int j=1; j<= n; j++ ) {
            int minEnergy = Integer.MAX_VALUE;
            for(int i=1; i<=k ; i++) {
                if(j-i >= 0) {
                    int energy = dp[j-i] + Math.abs(heights[j] - heights[j-i]);
                    minEnergy = Math.min(minEnergy, energy);
                }
            }
            dp[j] = minEnergy;
        }

        return dp[n];
    }
}
