//Given an array of integers A, find and return the product array of the same size where the ith element of the product array
//will be equal to the product of all the elements divided by the ith element of the array.

//Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.

//There are two approaches- Take the product of all the numbers and divide it by A[i]
public class Solution {
    public int[] solve(int[] A) {

        //TC- O(N) but we are using division operator here

      /*  int product =1;

        for(int i=0;i < A.length; i++){
           product = product * A[i];
        }
        
        for(int i=0;i < A.length; i++){
           A[i] = product/A[i];
        }

        return A;*/

        //Approach2- Without using division operator //Store the product of left numbers and right numbers till now.

        int n = A.length;
        int leftProduct[] = new int [n];
        int rightProduct[] = new int [n];

        int ans[] = new int [n];

        leftProduct[0] = 1;
        rightProduct[n-1] = 1;

        for(int i=1;i<n;i++){
           leftProduct[i]= leftProduct[i-1]*A[i-1];
           //System.out.println("left:" + leftProduct[i]);
        }

        for(int i=n-2;i>=0;i--){
           rightProduct[i]= rightProduct[i+1]*A[i+1];
           //System.out.println("right:" + rightProduct[i]);
        }

         for(int i=0;i< n;i++){
           ans[i]= leftProduct[i]*rightProduct[i];
        }

        return ans;
    }
}

  
