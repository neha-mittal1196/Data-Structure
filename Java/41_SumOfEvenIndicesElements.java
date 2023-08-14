// You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
// For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].

// Note : Use 0-based indexing
// A = [1, 2, 3, 4, 5]
// B = [   [0,2] 
//            [1,4]   ]


// [4, 8]

public class Solution {
    public int[] solve(int[] A, int[][] B) {
    //Brute force
    int sumOfOddIndicesForEachQuery [] = new int [B.length];
    int k=0;

    //For queries
    /*for(int i=0; i< B.length; i++){
      int si = B[i][0];
      int ei = B[i][1];
      int sum=0;
    
      for(int j=si; j<=ei; j++){
          if(j%2!=0)
           sum= sum + A[j];    
      }
      sumOfOddIndicesForEachQuery[k++]=sum;
    }
    return sumOfOddIndicesForEachQuery;*/

     // 2nd approach- Store prefix sum for each odd indexes Eg- 2,1,8,3,9 --> 2,210,10,19 //TC- O(N) SC- O(N)
    int prefixSum[] = new int[A.length]; 
    prefixSum[0] = 0;

    for(int i=1; i<A.length; i++){
        if(i%2!=0)
        prefixSum[i]= prefixSum[i-1]+ A[i];
        else
        prefixSum[i] = prefixSum[i-1];
        //System.out.println(prefixSum[i]);
    }

     for(int i=0; i< B.length; i++){
      int si = B[i][0];
      int ei = B[i][1];
      int sum=0;

      if(si == 0){
           sumOfOddIndicesForEachQuery[k++]= prefixSum[ei];
      } else {
           sumOfOddIndicesForEachQuery[k++]= prefixSum[ei] - prefixSum[si-1];
      }
    }
    return sumOfOddIndicesForEachQuery;
    }
}
