// You are given an array A of N integers.
// Return a 2D array consisting of all the subarrays of the array

// Note : The order of the subarrays in the resulting 2D array does not matter.
//A = [1, 2, 3]
//[[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]

public class Solution {
    public int[][] solve(int[] A) {

    int n = (A.length)*(A.length+1)/2;
    int subArrays[][] = new int[n][1];  
    int y=0;

    for(int i = 0 ; i < A.length ; i++){
        for(int j = i ; j < A.length ; j++){ 

            int k = 0;
            int newArray[] = new int[j-i+1]; 
            for(int m=i; m<=j; m++){
                newArray[k++] = A[m]; 
            }
            subArrays[y++] = newArray;
        }
    }

return subArrays;
        
}
}
