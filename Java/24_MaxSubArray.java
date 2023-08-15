// You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
// But the sum must not exceed B.

// A = 5
// B = 12
// C = [2, 1, 3, 4, 5]

//We can select {3,4,5} which sums up to 12 which is the maximum possible sum.

//Approach- Take sum of each subarray and compare 
public class Solution {
    public int maxSubarray(int A, int B, int[] C) {

        int sumOfArrayElements = 0;
        int maxSumTillNow = 0;

        for(int i=0;i < A; i++) {
           sumOfArrayElements = 0;
           for(int j=i;j < A; j++){
            sumOfArrayElements = sumOfArrayElements + C[j];
            if(sumOfArrayElements > B){
                sumOfArrayElements = sumOfArrayElements - C[j];
                break;
            }
        } 
        maxSumTillNow = Math.max(maxSumTillNow, sumOfArrayElements);
    }

    return maxSumTillNow;
  }
}
