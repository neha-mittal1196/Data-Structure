// Given an array A of N integers. Sort the array in increasing order of the value at the tens place digit of every number.

// If a number has no tens digit, we can assume value to be 0.
// If 2 numbers have same tens digit, in that case number with max value will come first
// Solution should be based on comparator.

// A = [15, 11, 7, 19]
// [7, 19, 15, 11]

// The sorted order is [7, 19, 15, 11]. The tens digit of 7 is 0, 
// and that of 19, 15 and 11 is 1.

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

         Collections.sort(A, new Comparator< Integer >(){
            @Override
            public int compare(Integer val1, Integer val2) {
                Integer tens_digit1 = (val1 / 10 ) % 10;
                Integer tens_digit2 = (val2 / 10 ) % 10;
                if (tens_digit1 == tens_digit2){
                    return val2 - val1;
            	}
                return tens_digit1 - tens_digit2;
            }    
        });
        return A;
    }
}
