// You are given a function to_upper() consisting of a character array A.

// Convert each character of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
// The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.
// Return the uppercase version of the given character array.

//  A = ['S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
// ['S', 'C', 'A', 'L', 'E', 'R', 'A', 'C', 'A', 'D', 'E', 'M', 'Y']

public class Solution {
    public char[] to_upper(char[] A) {
        
        for(int i=0; i< A.length; i++){
            int ch = A[i];
            if(ch >=97 && ch <=122){
                A[i] = (char)(ch - 32);
            }
        }
    return A;

    }
}
