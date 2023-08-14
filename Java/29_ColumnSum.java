//You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
//[1,2,3,4]
//[5,6,7,8]
//[9,2,3,4]

//{15,10,13,16}

public class Solution {
    public int[] solve(int[][] A) {

        int rowLen = A.length;
        int colLen = A[0].length;
        int ans[] = new int[colLen];

        for(int i=0; i<colLen;i++){
            int sum = 0;
            for(int j=0; j<rowLen; j++){
              sum = sum + A[j][i];
            }
           ans[i] = sum;
        }
        return ans;
    }
}
