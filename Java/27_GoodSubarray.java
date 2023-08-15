// Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
// 1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
// 2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
// Your task is to find the count of good subarrays in A.

// A = [1, 2, 3, 4, 5]
// B = 4

// Even length good subarrays = {1, 2}
// Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5} 

//Approach - Find each subarray ,compare its length and sum with B.
public class Solution {
    public int solve(int[] A, int B) {
        int lenOfSubarray = 0;
        int goodSubarrayCount = 0;
        
        for(int i = 0 ; i < A.length ; i++){
            int sumOfSubArray = 0;
            for(int j = i ; j < A.length ; j++){ 
                lenOfSubarray = j-i+1;
                sumOfSubArray = sumOfSubArray+ A[j];

                if(lenOfSubarray%2 == 0 && sumOfSubArray < B){
                    goodSubarrayCount++;
                }
                if(lenOfSubarray%2!= 0 && sumOfSubArray > B){
                    goodSubarrayCount++;
                }
            }
        }

        return goodSubarrayCount;
    }
}
