// Given an array A of N non-negative numbers and a non-negative number B,
// you need to find the number of subarrays in A with a sum less than B.
// We may assume that there is no overflow.

//  A = [2, 5, 6]
//  B = 10
// Output - 4
// The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},

public class Solution {
    public int solve(int[] A, int B) {

        int subSubarrayCountLessThanB = 0;
        for(int i = 0 ; i < A.length ; i++){
            int sumOfSubArray = 0;
            for(int j = i ; j < A.length ; j++){ 
                sumOfSubArray = sumOfSubArray+ A[j];
                if(sumOfSubArray < B){
                    subSubarrayCountLessThanB++;
                }
            }
        }

        return subSubarrayCountLessThanB;
    }
}
