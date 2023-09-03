// You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.

// [1,2,3,4]
// [5,6,7,0]
// [9,2,0,4]

// [1,2,0,0]
// [0,0,0,0]
// [0,0,0,0]

public class Solution {
    public int[][] solve(int[][] A) {

    int rowLength = A.length;
    int colLength = A[0].length;

    Set<Integer> rowsPositions = new HashSet<>();
    Set<Integer> columnsPositions = new HashSet<>();

    for(int i=0;i< rowLength ; i++){
       for(int j=0;j< colLength; j++){
           if(A[i][j] == 0){
             rowsPositions.add(i);
             columnsPositions.add(j);
           }
       }
    }  
      
    for(Integer row : rowsPositions) {
          for(int col=0;col <colLength; col++){
                 A[row][col] = 0;
          }
    }

    for(Integer col : columnsPositions) {
          for(int row=0;row <rowLength; row++){
                 A[row][col] = 0;
            }
    }  

  return A;

//2nd approach - Use array instead of set.
    int n = A.length;
    int m = A[0].length;

    int row[] = new int[n];
    int col[] = new int[m];

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(A[i][j] == 0){
                row[i] = -1;
                col[j] = -1;
            }
        }
    }

    for(int i=0;i< n;i++){
        for(int j=0;j< m;j++){
            if(row[i] == -1|| col[j] == -1){
                 A[i][j] = 0;
            }
        }
    }
    
    return A;

        
 }
}
