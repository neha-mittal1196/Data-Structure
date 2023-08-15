// Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
// Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
// A=[2, 1, 6, 4]
// 1
//Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
//Therefore, the required output is 1. 

//Approach- If we remove ith elememts, all the indexes after ith element will be reversed.
public class Solution {
    public int solve(int[] A) {
       
       int n = A.length;
       int prefixSumOfEvenElements[] = new int[n];
       int prefixSumOfOddElements[] = new int[n];

       prefixSumOfEvenElements[0] = A[0];
       prefixSumOfOddElements[0] = 0;       

       for(int i=1;i< n;i++) {
         
        if(i%2 == 0){
            prefixSumOfEvenElements[i] = prefixSumOfEvenElements[i-1]+ A[i];
            prefixSumOfOddElements[i] = prefixSumOfOddElements[i-1];
        }
        else {
            prefixSumOfEvenElements[i] = prefixSumOfEvenElements[i-1];
            prefixSumOfOddElements[i] = prefixSumOfOddElements[i-1]+ A[i];
        }
       }

       int sumOfEvenElements = 0;
       int sumOfOddElements = 0;
       int specialElements = 0;

       for(int i=0;i< n;i++) {
        if(i==0){
          sumOfEvenElements = prefixSumOfEvenElements[n-1] - prefixSumOfEvenElements[0];
          sumOfOddElements = prefixSumOfOddElements[n-1] - prefixSumOfOddElements[0];

        } else {
          sumOfEvenElements = prefixSumOfOddElements[n-1] - prefixSumOfOddElements[i] + prefixSumOfEvenElements[i-1];
          sumOfOddElements = prefixSumOfEvenElements[n-1] - prefixSumOfEvenElements[i] + prefixSumOfOddElements[i-1];
        }
        if(sumOfEvenElements == sumOfOddElements)
           specialElements++;
       }

     return specialElements;

    }
}
