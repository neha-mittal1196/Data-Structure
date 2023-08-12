//You are given an integer array A of length N.
//You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
//For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
//More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {

        //TC- O(N), SC- O(N)
        long prefixSum[] = new long[A.length];
        long ans[] = new long [B.length];

        prefixSum[0] = A[0];
        for(int i=1;i< A.length; i++){
           prefixSum[i] = prefixSum[i-1]+ A[i];
        }

       for(int i=0;i< B.length; i++) {
           int si = B[i][0];
           int ei = B[i][1];
          
          if(si==0)
            ans[i] =  prefixSum[ei];
          else  
            ans[i] =  prefixSum[ei] - prefixSum[si-1];          
       }
    
    return ans;
        
    }
}
