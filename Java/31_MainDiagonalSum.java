//You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
//Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.

//3 3 1 -2 -3 -4 5 -6 -7 -8 9

//Approach 1- Take all the elements one by one. compare i and j and add the elements with i = j

public class Solution {
    public int solve(final int[][] A) {

        int rowLen = A.length;
        int colLen = A[0].length;
        int diagonalSum = 0;

        for(int i=0; i<rowLen;i++){
            int sum = 0;
            for(int j=0; j<colLen; j++){
              if(i == j)
                diagonalSum = diagonalSum + A[i][j];
            }
        }
        return diagonalSum;
    }

  //Approach 2- As its a N*N matrix, we can just iterate for i=0:n-1.
  public int solve(final int[][] A) {

        int n = A.length;
        int diagonalSum = 0;
    
        for(int i=0; i<rowLen;i++){
            diagonalSum = diagonalSum + A[i][i];     
        }
        return diagonalSum;
  }
}
