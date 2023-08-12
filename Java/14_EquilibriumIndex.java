//You are given an array A of integers of size N.
//Your task is to find the equilibrium index of the given array
//The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
//If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

//Note:
//Array indexing starts from 0.
//If there is no equilibrium index then return -1.
//If there are more than one equilibrium indexes then return the minimum index.
  
public class Solution {
    public int solve(int[] A) {

      //TC-O(N), SC-O(N)

        int leftPrefixSum[] = new int[A.length];
        leftPrefixSum[0]= 0;

        for(int i=1;i< A.length; i++){
           leftPrefixSum[i] = leftPrefixSum[i-1]+ A[i-1];   //V.Imp - Here have to take A[i-1] not A[i]
        }

        int rightPrefixSum[] = new int[A.length];
        rightPrefixSum[A.length - 1]= 0;
        
        for(int i=A.length-2;i>=0; i--){
           rightPrefixSum[i] = rightPrefixSum[i+1]+ A[i+1];
            //System.out.println(" yo: "+rightPrefixSum[i]);
        }

        for(int i=0;i< A.length; i++){
            if(leftPrefixSum[i] == rightPrefixSum[i])
               return i;
        }

        return -1;
        

    }
}
