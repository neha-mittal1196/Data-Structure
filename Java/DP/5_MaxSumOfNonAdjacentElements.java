// Given a 2 x N grid of integers, A, your task is to choose numbers from the grid such that sum of these numbers is maximized. 
// However, you cannot choose two numbers that are adjacent horizontally, vertically, or diagonally. 

// Return the maximum possible sum.

// Note: You are allowed to choose more than 2 numbers from the grid.

 // Input
 // A = [   
 //        [1, 2, 3, 4]
 //        [2, 3, 4, 5]    
 //     ]

//Output -  8

public class Solution {
    int dp[];
    public int adjacent(int[][] A) {
        int n = A[0].length;
        int arr[] = new int [n];

        for(int j=0; j<n; j++){
            arr[j] = Math.max(A[0][j], A[1][j]);
        }

        dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0] = arr[0];
        return maxSum(n-1, arr);
    }

    //1st approach - Recursion
    // int maxSum(int n, int arr[]) {
    //     if(dp[n] != -1) {
    //         return dp[n];
    //     }


    //     int max1 = maxSum(n-1, arr);
    //     int max2 = arr[n];
    //     if(n-2 >=0) {
    //         max2 = max2 + maxSum(n-2, arr);
    //     }
    //     return dp[n] = Math.max(max1, max2);
    // }

    //2nd approach - Tabulation
    int maxSum(int n, int arr[]) {
        for(int i=1; i<= n; i++) {
            int max1 = dp[i-1];
            int max2 = arr[i];
            if(i-2 >= 0) {
                max2 = max2 + dp[i-2] ;
            }

            dp[i] = Math.max(max1, max2);
        }
        return dp[n];
    }
}
