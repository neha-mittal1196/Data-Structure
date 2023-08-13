//Say you have an array, A, for which the ith element is the price of a given stock on day i.
//If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//Return the maximum possible profit.
  
public class Solution {
    public int maxProfit(final int[] A) {

      //TC- O(N)
        if(A.length == 0 || A.length == 1)
          return 0;

        int minSoFar = A[0];
        int maxProfit = 0;

        for(int i=1;i< A.length; i++) { 
            maxProfit = Math.max(maxProfit, A[i] - minSoFar);
            minSoFar = Math.min(minSoFar, A[i]);
        }

        return maxProfit;
    }
}
