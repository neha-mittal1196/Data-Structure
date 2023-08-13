//You are given an integer array A of size N.
//You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
//Find and return the maximum possible sum of the B elements that were removed after the B operations.
//NOTE: Suppose B = 3, and array A contains 10 elements, then you can:

// Remove 3 elements from front and 0 elements from the back, OR
// Remove 2 elements from front and 1 element from the back, OR
// Remove 1 element from front and 2 elements from the back, OR
// Remove 0 elements from front and 3 elements from the back.

//A = [5, -2, 3 , 1, 2]  Input
//B = 3  Output
//8
public class Solution {
    public int solve(int[] A, int B) {

    //As we need to remove elements in such a way that the sum of those elements is max, we can find
    //contiguous subarray whose sum is mininum and get the difference between total sum and minsum of the subarray obtained.
    // We can use sliding window approach for subarrays

    int n = A.length; //6
    int subarrayLength = n - B; // 2 as B is 4.
    int sumOfArrayElements = 0;
   
   //Sum of all the elements
    for(int i=0;i< n; i++){
       sumOfArrayElements = sumOfArrayElements + A[i];
    }

    int si = 0;
    int ei = subarrayLength -1;
    int sumOfContiguousElements = 0;
    int minSubArrayCount = 0;
 
    for(int i=si;i<=ei; i++){
        sumOfContiguousElements = sumOfContiguousElements + A[i];
    }
    minSubArrayCount = sumOfContiguousElements;
    si++;
    ei++;

    while(ei < n){    
     sumOfContiguousElements = sumOfContiguousElements+ A[ei] - A[si-1];
     minSubArrayCount = Math.min(minSubArrayCount,sumOfContiguousElements);
     si++;
     ei++;

    }

    return sumOfArrayElements - minSubArrayCount;
    }
}
