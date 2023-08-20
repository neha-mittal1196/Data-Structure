// Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
// Input 2:
//     A = "111011101"
// Output 2:
//     7

//Approach - Store total 1s until 0 comes in left and right array. Take the sum of left 1s and right 1s. If total sum is less than total ones add 1 to it.
//l+r+1 else l+r.
//no-    111011101
//left-  123012301
//right- 321032101

// 2 edges cases
// '1111111111111'
// '0111111111111'
public class Solution {
    public int solve(String A) {

    //Find total no. of 1s.
    int totalCntOfOnes = 0;
    int n = A.length();

    for(int i=0;i<n ; i++) {
        if(A.charAt(i) == '1')  //'1111111111111'
            totalCntOfOnes++;
    }

    if(totalCntOfOnes == n){
        return n;
    }
    //System.out.println(totalCntOfOnes);

    int leftCntOnes[] = new int [n];
    int rightCntOnes[] = new int [n];
     
    if(A.charAt(0) == '1')
       leftCntOnes[0] = 1;
    else
       leftCntOnes[0] = 0;
    
    for(int i=1;i< n; i++) {
     if(A.charAt(i) == '1')
       leftCntOnes[i] = leftCntOnes[i-1]+ 1;
     else
       leftCntOnes[i] = 0;
       //System.out.print(leftCntOnes[i]+ ",");
    }
     //System.out.println();

    if(A.charAt(n-1) == '1')
       rightCntOnes[n-1] = 1;
    else
       rightCntOnes[n-1] = 0;


    for(int i=n-2;i>=0; i--) {
     if(A.charAt(i) == '1')
       rightCntOnes[i] = rightCntOnes[i+1]+ 1;
     else
       rightCntOnes[i] = 0;
       //System.out.print(rightCntOnes[i]+ ",");
    }

    int maxConsecutiveOnes = 0;
    int totalConsecutiveOnes = 0;

    for(int i=0; i<n; ++i )
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes,Math.max(rightCntOnes[i],leftCntOnes[i])); //'0111111111111'

    for(int i=1;i< n-1 ; i++) {

        if(A.charAt(i) == '0'){
            int currOnesSum = leftCntOnes[i-1]+ rightCntOnes[i+1];
            if(currOnesSum < totalCntOfOnes)
              totalConsecutiveOnes = currOnesSum + 1;
            else if( currOnesSum == totalCntOfOnes)
              totalConsecutiveOnes = currOnesSum;
        
        maxConsecutiveOnes = Math.max(maxConsecutiveOnes, totalConsecutiveOnes);
        //totalConsecutiveOnes = 0;
        }
    }

    return maxConsecutiveOnes;
    
    }
}
