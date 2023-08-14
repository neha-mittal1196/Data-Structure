//Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
//Note: It is possible to swap any two elements, not necessarily consecutive.
//Return the minimum number of swaps.
// A = [1, 12, 10, 3, 14, 10, 5]
// B = 8
//Output- 2

 // A = [1, 12, 10, 3, 14, 10, 5]
 // After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
 // After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
 // Now, all elements less than or equal to 8 are together.

//Approach- Here take a window of elements that needs to be together { Elements less than B }. For that window check how many elements needs to be swapped. Compare no of swaps and find the result.
public class Solution {
    public int solve(int[] A, int B) {
        
        int n = A.length;
        int noOfElementsLessThanB = 0;

        for(int i=0;i< n; i++) {
            if(A[i] <= B)
              noOfElementsLessThanB++;
        }
        
        int si = 0 ;
        int ei = noOfElementsLessThanB - 1;
        int bad = 0;

        for(int i=si; i<=ei;i++){
            if(A[i] > B)
              bad++;
        }

        int swaps = bad;

        si++;
        ei++;

        while(ei < n) {
         if(A[ei] > B)
           bad++;
         if(A[si-1] > B)
           bad--;

         swaps = Math.min(bad,swaps);
         si++;
         ei++;
        }
        return swaps;

    }

}
