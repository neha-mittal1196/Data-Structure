Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.

public class Solution {
    public int solve(ArrayList<Integer> A) {

        // TC - O(N)
        int max = A.get(0);
        int min = A.get(0);

        for(int i=1; i< A.size(); i++){
             if(A.get(i) > max)
                max = A.get(i);

             if(A.get(i) < min )
                min = A.get(i);
        }

        return max + min;
    }
}
