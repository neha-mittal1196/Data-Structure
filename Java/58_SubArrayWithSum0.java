// Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

// If the given array contains a sub-array with sum zero return 1, else return 0.
// A = [1, 2, 3, 4, 5]
// 0
// A = [4, -1, 1]
// 1  

public class Solution {
  // Do not write code to include libraries, main() function or accept any input from the console.
  // Initialization code is already written and hidden from you. Do not write code for it again.
  public int solve(int[] A) {
      // Just write your code below to complete the function. Required input is available to you as the function arguments.
      // Do not print the result or any output. Just return the result via this function.

    //Approach1- 2 loops- Get each subarray and find its sum = 0 TC- O(N^3)
    //Approach2- Store the prefix sum in an array. If the prefix sum repeats or is 0, it means subarray exits with sum 0. TC- O(N^2), SC- O(N)
    //Approach3- Carry forward. If the prefix sum repeats or is 0, it means subarray exits with sum 0. TC- O(N^2), SC- O(1)

    
     //Approach 3- Immediately keep on checking whether set contains that element or not. //TC- O(N)
    /*long sum = 0;
    Set<Long> set = new HashSet<>();
    set.add(0L); //Before iterating sum is 0.

    // 2,2,1,-3,4,3,1,-2,-3,2,-7
    //pf[] = 2,4,5,2,6,9,10,8,5,7,0  pf[2] = 5 , pf[8]= 5 
    
    for(int i=0;i< A.length; i++){
        sum = sum + A[i];
        if(set.contains(sum)){
            return 1;
        }else
           set.add(sum);
    }

    return 0;*/
 

     //Approach 2- Store elements in prefix sum. Check if the prefix sum is 0 anywhere, it means there exits a subarray with sum 0. If the prefix sum contains the same element then also subarray exits with sum 0.
    long prefixSum [] = new long[A.length];
    prefixSum[0] = A[0];

    for(int i=1;i< A.length; i++){
        prefixSum[i]= prefixSum[i-1]+ A[i];
    }

    Set<Long> set = new HashSet<>();
    for(int i=0;i< A.length; i++){
        if(prefixSum[i] == 0) 
          return 1;
        else
          set.add(prefixSum[i]);
    }

    if(set.size() == prefixSum.length)
        return 0;
    else
        return 1;
  }
}
