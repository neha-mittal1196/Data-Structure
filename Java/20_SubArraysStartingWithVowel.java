//You are given a string S, and you have to find all the amazing substrings of S.
//An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
//Input -ABEC- A, AB, ABE, ABEC, E, EC
//Ouput-6

//Approach- Whenever we see a vowel get the length of subarray from that char onwards.
public class Solution {
    public int solve(String A) {
    int cntOfSubarrays = 0;
    int n = A.length();

    for (int i = 0; i < n; i++) {
         if(A.charAt(i)=='A' || A.charAt(i)=='a' 
         || A.charAt(i)=='e' || A.charAt(i)=='i' 
         || A.charAt(i)=='o' || A.charAt(i)=='u'
         || A.charAt(i)=='E' || A.charAt(i)=='I' 
         || A.charAt(i)=='O' || A.charAt(i)=='U') {
          cntOfSubarrays = cntOfSubarrays + n - i;        
        }
        cntOfSubarrays = cntOfSubarrays%10003;     
    }

    return cntOfSubarrays%10003;    
  }
}
