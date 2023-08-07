//Given an integer array A of size N. In one second, you can increase the value of one element by 1.
//Find the minimum time in seconds to make all elements of the array equal.
//A = [2, 4, 1, 3, 2] -  A = [4, 4, 4, 4, 4].

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int max = A.get(0);
        int sum = 0 ;

        for(int i=1; i< A.size(); i++) {
            if(A.get(i) > max)
              max = A.get(i);
        }

        for(int i=0; i< A.size(); i++) {
            sum = sum + max - A.get(i);
        }

        return sum;
    }
}
