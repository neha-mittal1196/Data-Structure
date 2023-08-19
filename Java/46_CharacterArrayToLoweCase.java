// You are given a function to_lower() which takes a character array A as an argument.

// Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
// The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.
// Return the lowercase version of the given character array.

//  A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
//  ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']

public class Solution {
    public char[] to_lower(char[] A) {

        for(int i=0; i< A.length; i++){
           int c = A[i];
           if(c >=65 && c<=90){
               A[i] = (char) (c + 32);
           }
        }
    return A;
    }
}
