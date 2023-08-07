//You are given an integer A. You have to tell whether it is a perfect number or not.
//Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//A proper divisor of a natural number is the divisor that is strictly less than the number.

public class Solution {
    public int solve(int A) {
      
  // Edge case - 1
        if (A == 1)
            return 0;
 //Iterate from 2 till sqrt(N). Only in case of a perfect square need to add factor once. For other cases, need to add both the factors.      

        int factorSum = 1;

        for (int i = 2; i * i <= A; i++) {

            if (A % i == 0) {
                if (i * i == A)
                    factorSum = factorSum + i;
                else
                    factorSum = factorSum + i + A / i;

            }
        }

        if (factorSum == A)
            return 1;
        else
            return 0;

    }
}
