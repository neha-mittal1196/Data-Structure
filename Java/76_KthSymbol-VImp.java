// On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
// Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).

//  A = 4
//  B = 4
//  Row 1: 0
//  Row 2: 01
//  Row 3: 0110
//  Row 4: 01101001
//Output- 1 01101 <-- this bit basically.
Here bits counting from left to right.

//Approach is row 4 is [row3, Xor of row3] , row3 is [row2, Xor of row2] and so on.....
public class Solution {
    public int solve(int A, int B) { 
      return getRow(A, B);     
    }

    int getRow(int A, int B) {
        if(A == 1)
           return 0;
         
        int mid = (int) Math.pow(2,A-1)/2;  //For nth row imp is - middle bit will be 2^n-
        //long mid = (long) Math.pow(2,A-1)/2; //For problem 77.
        if(B < mid){
             return getRow(A-1, B);
        }
        else{
             int x = getRow(A-1, B-mid);  //Get Xor of row in case bit is > mid. Eg- Lets say B=5 , mid= 4 for 4th row 01101001. We need to
              return x^1;
        }
    }
}
