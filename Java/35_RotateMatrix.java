// You are given a n x n 2D matrix A representing an image.
// Rotate the image by 90 degrees (clockwise).
// You need to do this in place.
// Note: If you end up using an additional array, you will only receive partial score.

// [
//     [1, 2, 3],
//     [4, 5, 6],
//     [7, 8, 9]
//  ]

//  [
//     [7, 4, 1],
//     [8, 5, 2],
//     [9, 6, 3]
//  ]

public class Solution {
    public void solve(int[][] A) {

    int n = A.length;

    //Transpose the matrix without extra space.

    for(int i=0;i< n; i++){
       for(int j=0;j< n; j++){
         if(i<j){
            int temp = A[i][j];
            A[i][j] = A[j][i];
            A[j][i] = temp;
         }
      }       
    }
    
    //Flip rows
    for(int i=0;i< n; i++){
       for(int j=0;j< n; j++){
         if(j < n/2 ){
            int temp = A[i][j];
            A[i][j] = A[i][n-1-j];
            A[i][n-1-j] = temp;
         }
      }       
    }
}
}
