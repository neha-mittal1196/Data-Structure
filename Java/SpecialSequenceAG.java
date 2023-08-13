//You have given a string A having Uppercase English letters.
//You have to find how many times subsequence "AG" is there in the given string.
//NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

public class Solution {
    public int solve(String A) {

        int cntA = 0;
        long cntSub = 0;

        for(int i=0; i< A.length(); i++){

            if(A.charAt(i) == 'A')
              cntA++;
            
             if(A.charAt(i) == 'G')
              cntSub = cntSub + cntA;
        }

        return (int)(cntSub%(Math.pow(10,9)+7)); // It is very important
    }
}
