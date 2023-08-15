// You are given an integer array A of length N.
// You have to find the sum of all subarray sums of A.
// More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
// A subarray sum denotes the sum of all the elements of that subarray.

// Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
//A = [1, 2, 3]
//20

//The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
//Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20


public class Solution {
    public long subarraySum(int[] A) {

      // Approach1 - Use carry forward to keep on adding subarray sum to total sum.
        /*int n = A.length;
        long totalSum = 0;
        for(int i=0;i <n; i++){
            int individualSubarraySum = 0;
            for(int j=i;j <n; j++){
               individualSubarraySum = individualSubarraySum+ A[j];
               totalSum += individualSubarraySum;
            }   
        }
        return totalSum;*/

       // Approach2 - Find contribution of every element in total sum.
        int n = A.length;
        long totalSum = 0;
        for(int i=0;i <n; i++){
           totalSum = totalSum + (long) (i+1)*(n-1-i+1)*A[i];
        }
    return totalSum;

    }
}
