//Given an array A and an integer B, find the number of occurrences of B in A.

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        
        int count = 0;
        //TC- O(N)
        for(int i=0; i< A.size(); i++){
             if(A.get(i) == B)
               count++;
        }
    return count;

    }
}
