// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

// Example 1:

// Input: nums = [2,3,2]
// Output: 3
// Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
// Example 2:

// Input: nums = [1,2,3,1]
// Output: 4

class Solution {
    int dp[];
    public int rob(int[] nums) {
        //Its a problem of max sum of adjacent elements
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int nums1[] = new int[n-1];
        int nums2[] = new int[n-1];

        for(int i=0; i<=n-2; i++) {
            nums1[i] = nums[i];
        }

        int j = 0;
        for(int i=1; i<= n-1; i++) {
            nums2[j] = nums[i]; //1, 2
            j++;
           
        }
         
        dp = new int [n-1];
        Arrays.fill(dp, -1);
        dp[0] = nums1[0];
        int includeFirstElement = maxSum(nums1, n-2);

        Arrays.fill(dp, -1);
        dp[0] = nums2[0];
        int excludeFirstElement = maxSum(nums2, n-2);

        return Math.max(includeFirstElement, excludeFirstElement);
    }

    int maxSum(int[] arr, int n) {

        if(dp[n] != -1) {
            return dp[n];
        }

        int max1 = maxSum(arr, n-1);
        int max2 = arr[n];
        if(n-2 >= 0 )
            max2 = max2 + maxSum(arr, n-2);

        return dp[n] = Math.max(max1, max2);
    }
}
