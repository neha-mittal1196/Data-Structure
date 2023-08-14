// Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

// 1 2 3
// 4 5 6
// 7 8 9

// 1 0 0
// 2 4 0
// 3 5 7
// 6 8 0
// 9 0 0


public class Solution {
    public int[][] diagonal(int[][] A) {

        // 4*7 matrix
        int n = A.length;
        int res[][] = new int[2*n-1][n];

        int colLen = n;
        int rowLen = n;

        for(int i=0; i<colLen;i++){
            int row = 0;
            int col = i;
            while(row <=i && col >=0){
                res[i][row] = A[row][col];
                col--;
                row++;
            }
        }


        for(int i=1; i< n;i++){
            int row = i;
            int col = n-1;

            while(col >= 0 && row <n){
                res[n+i-1][n-col-1] = A[row][col];
                col--;
                row++;
            }
        }
     return res;

    }
}
