// You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
// Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
//  A = [[1, -2, -3],
//       [-4, 5, -6],
//       [-7, -8, 9]]
// -5 

public class Solution {
    public int solve(final int[][] A) {

        int n = A.length;
        int diagonalSum = 0;

        for(int i=0; i< n;i++){
            int sum = 0;
            for(int j=0; j< n; j++){
              if(i+j == n-1)
                diagonalSum = diagonalSum + A[i][j];
            }
        }
        return diagonalSum;

      //Approach2
        int n = A.length;
        int diagonalSum = 0;

        for(int i=0; i< n;i++){
           diagonalSum = diagonalSum + A[i][n-1-i]; 
        }
        return diagonalSum;
    }
}
