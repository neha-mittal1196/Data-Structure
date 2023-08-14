//Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
//Return a 2-D matrix which consists of the elements added in spiral order.

// 5
// [ [1,   2,  3,  4, 5], 
//   [16, 17, 18, 19, 6], 
//   [15, 24, 25, 20, 7], 
//   [14, 23, 22, 21, 8], 
//   [13, 12, 11, 10, 9] ]

//Approach- Iterate from left to right, top to bottom and so on. N= N-2 is very imp condition 

public class Solution {
    public int[][] generateMatrix(int A) {

        int rowIndex = 0;
        int colIndex = 0;
        int res[][] = new int[A][A];
        int num = 1;
        int n = A;

        while(n > 1){
        
        //From left to right
        for(int i=1;i< n; i++){
              res[rowIndex][colIndex] = num++;
              colIndex++;
        }

        //From top to bottom
        for(int i=1;i< n; i++){
              res[rowIndex][colIndex] = num++;
              rowIndex++;
        }

        //From right to left
        for(int i=1;i< n; i++){
              res[rowIndex][colIndex] = num++;
              colIndex--;
        }

        //From bottom to top
        for(int i=1;i< n; i++){
              res[rowIndex][colIndex] = num++;
              rowIndex--;
        }
       
       //Mistake u did ---> Once completed increment the row and column
        rowIndex++;
        colIndex++;
        n = n-2;   
        
    }
     
    if(n==1)
        res[rowIndex][colIndex] = num++;

    return res;
    }
}
