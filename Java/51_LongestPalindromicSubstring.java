// Given a string A of size N, find and return the longest palindromic substring in A.

// Substring of string A is A[i...j] where 0 <= i <= j < len(A)

// Palindrome string:
// A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

// Incase of conflict, return the substring which occurs first ( with the least starting index).
// A = "aaaabaaa"
// "aaabaaa"

//Approach- For odd length palindromes , consider each character as the middle of the palindrome. Iterate from that character to left and right until the characters doesn't match.
//Once character unmatches, take that substring and compare its length and get the longest substring.

public class Solution {
    public String longestPalindrome(String A) {
        
        int n = A.length();
        int max = 0;
        String ans = "";
        
        //for odd length palindromes
        for(int i=0;i< n; i++){
            int left = i;
            int right = i;

            String longestPalindrome = getLongestPalindrome(left, right, A);
            if(longestPalindrome.length() > max){
               max = longestPalindrome.length();
               ans = longestPalindrome;
            }
        }

         //for even length palindromes
        for(int i=0;i< A.length()-1; i++){
            int left = i;
            int right = i+1;
            String longestPalindrome = getLongestPalindrome(left, right, A);
            if(longestPalindrome.length() > max){
               max = longestPalindrome.length();
               ans = longestPalindrome;
            }
        }
        //System.out.println(max);

        return ans;

    }

    public String getLongestPalindrome(int left, int right, String A) {
        
        String s = "";
        while(left >=0 && right <= A.length()-1){
               if(A.charAt(left) == A.charAt(right)){
                 left --;
                 right++;
                } else
                   break;
        }

         //int length = right - left + 1 -2;
        s = A.substring(left+1, right);
        return s;
    }
}
