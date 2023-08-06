public class Solution {
    public int solve(int A) {
        
    //1st- Brute force-  Iterate from 2 to N-1 and check if the number is prime or not. Edge case- 1 is not a prime.
         if (A == 1)
             return 0;
         for (int i = 2; i < A; i++) {
             if (A % i == 0)
                 return 0;
         }

         return 1;
         
    //2nd- Optimised- Iterate till sqrt(A) instead of N and check if the number is prime or not.
         if (A == 1)
             return 0;
         for (int i = 2; i*i <=A; i++) {
             if (A % i == 0)
                 return 0;
         }

         return 1;


    //3rd- Optimised- Count no of factors - If 2 then prime else not prime
        if (A == 1)
            return 0;
        if (countFactors(A) == 2)
            return 1;
        else
            return 0;
    }

    int countFactors(int A) {

        int factorCount = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if (i * i == A) {
                    factorCount++;
                } else
                    factorCount = factorCount + 2;
            }
        }
        return factorCount;
    }

}
