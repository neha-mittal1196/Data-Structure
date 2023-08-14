//Two variations to this question - Subarray with given sum and length and Subarray with least average. 

//Given an array A of length N. Also given are integers B and C.
//Return 1 if there exists a subarray with length B having sum C and 0 otherwise.
//A = [4, 3, 2, 6, 1]
//B = 3
//C = 11
//Ouput 1

//Given an array of size N, find the subarray of size K with the least average. Return the index of the first element of the subarray of size k that has least average.
Array indexing starts from 0.
//A=[3, 7, 90, 20, 10, 50, 40]
//B=3
//Ouput 3

//Approach1- Take one subarray window of length B and calculate the sum. Compare it with C . If matches return 1 else return 0.
//Approach 2- Store the prefix sum of the elements in an array. Take each subarray and find its sum. Compare with C and return 1 or 0 accordingly.
public class Solution {
    public int solve(int[] A, int B, int C) {
        int si = 0;
        int ei = B-1;
        int sum = 0;

        for(int i=si;i<= ei;i++){
            sum = sum + A[i];
        }

        if(sum == C){
            return 1;
        }

        si++;
        ei++;

        while(ei < A.length) {
          sum = sum + A[ei] - A[si-1];
          if(sum == C)
            return 1; 

            si++;
            ei++;
        }
        return 0;
    }
}
