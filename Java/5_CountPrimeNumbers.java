//You will be given an integer n. You need to return the count of prime numbers less than or equal to n.

public class Solution {
    public int solve(int A) {
        int primeFactorsCount = 0;
        //Edge case- In case of 2, prime is 1.
        if(A == 2)
          return 1;

      //Iterate from 2 till that number and check that number is prime or not. O(N*sqrt(N)
        for(int i=2; i<=A; i++){
            if(isPrime(i)== 1)
               primeFactorsCount++;    
        }

         return primeFactorsCount;
    }

    int isPrime(int A){
        if (A == 1)
            return 0;

        for (int i = 2; i*i <=A; i++) {
            if (A % i == 0)
                return 0;
        }

        return 1;
    }
}
