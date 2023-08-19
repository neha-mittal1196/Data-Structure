// Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

// The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

// Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
// A = ["abcdefgh", "aefghijk", "abcefgh"]
// "a"

//Approach- Sort all the strings. Compare first and last string's chars and get max common chars. 
public class Solution {
    public String longestCommonPrefix(String[] A) {

        Arrays.sort(A);
        int n = A.length;
        //As its sorted length of first one will always be smaller
        char charArrayFirst[] = new char[A[0].length()];
        char charArrayLast[] =  new char[A[n-1].length()];
        charArrayFirst = A[0].toCharArray();
        charArrayLast = A[n-1].toCharArray();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while(i < charArrayFirst.length  && i < charArrayLast.length){
            if(charArrayFirst[i] == charArrayLast[i]){
                sb.append(charArrayFirst[i]); 
            }else
              break;
            i++;
        }

        return sb.toString();
    }
}
