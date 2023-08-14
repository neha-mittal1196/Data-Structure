//A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
//[[1, 4, 7], [2, 5, 8], [3, 6, 9]]

public class Solution {
    public int[][] solve(int[][] A) {

        int rowLen = A.length;
        int colLen = A[0].length;

        int transposeMat[][] = new int[colLen][rowLen];

        for(int i=0; i< rowLen;i++) {
            for(int j=0; j< colLen; j++){
              transposeMat[j][i] = A[i][j];
            }
        }

        return transposeMat;
    }
}
