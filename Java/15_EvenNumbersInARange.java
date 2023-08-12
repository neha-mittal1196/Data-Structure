//You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
//Each query consists of two integers B[i][0] and B[i][1].
//For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].

public class Solution {
    public int[] solve(int[] A, int[][] B) {

      //TC-O(N), SC- O(N)

        int ans[] = new int[B.length];
        int prefixEvenNo[] = new int[A.length];
        prefixEvenNo[0] = A[0]%2==0 ? 1: 0;

        for(int i=1;i< A.length; i++){
            if(A[i]%2 == 0)
                prefixEvenNo[i] = prefixEvenNo[i-1]+ 1;  //If even, add sum 
            else
                prefixEvenNo[i] = prefixEvenNo[i-1];   //If odd, dont add
        }

         for(int i=0;i< B.length; i++) {
           int si = B[i][0];
           int ei = B[i][1];
          
          if(si==0)
            ans[i] =  prefixEvenNo[ei];
          else  
            ans[i] =  prefixEvenNo[ei] - prefixEvenNo[si-1];          
       }
    
    return ans;

      //2nd approach- SC-O(1)
      //Do not create separate prefixEvenNo array. Instead replace every no with 1 and odd with 0.Then take the sum range.
    }
}
