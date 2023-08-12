//Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
//and at least one occurrence of the minimum value of the array.
public class Solution {
    public int solve(int[] A) {

        //TC - O(N)
        int n = A.length;
        int max = A[0];
        int min = A[0];
        int minIndex = -1;
        int maxIndex = -1;
        int ans = n;

        //Find min and max value from the array.
        for(int i=1;i< n;i++){
          max = Math.max(max, A[i]);
          min = Math.min(min, A[i]);
        }

         //Iterate over all the elements. If found max/min element, check the occurence of last min/max element's position. Find the diff and get min subarray value.
        for(int i=0;i< n;i++){
            if(A[i] == min) {
                minIndex = i;
            
            if(maxIndex > -1)
                ans = Math.min(ans, minIndex- maxIndex + 1);
            
           }

            if(A[i] == max) {
                maxIndex = i;

            if(minIndex > -1)
                ans = Math.min(ans, maxIndex - minIndex +1);
            
           }
        }
    return ans;
    }
}
