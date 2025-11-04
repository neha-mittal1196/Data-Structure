// Problem Description

// Given a positive integer A, write a program to find the Ath Fibonacci number.
// In a Fibonacci series, each term is the sum of the previous two terms and the first two terms of the series are 0 and 1. i.e. f(0) = 0 and f(1) = 1. Hence, f(2) = 1, f(3) = 2, f(4) = 3 and so on.
// NOTE: 0th term is 0. 1th term is 1 and so on.


// Problem Constraints
// 0 <= A <= 44

//Input A = 4, Output = 3
//Input A = 6, Output = 8


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int dp[] = new int[A+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;

        System.out.print(fibonnaci(A, dp));
    }

    // 1st approach - Recursion
    public static int fibonnaci(int A, int []dp) {
        if(dp[A] != -1) {
            return dp[A];
        }
        return dp[A] = fibonnaci(A-1, dp) + fibonnaci(A-2, dp);
    }

    //2nd approach - Tabulation
     public static int fibonnaci(int A, int []dp) {
        for(int i=2; i<=A; i++) {
            dp[i] = dp[i-1]+ dp[i-2]; 
        }

        return dp[A];
    }

}
