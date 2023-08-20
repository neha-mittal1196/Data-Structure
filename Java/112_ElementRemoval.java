// Given an integer array A of size N. You can remove any element from the array in one operation.
// The cost of this operation is the sum of all elements in the array present before this operation.

// Find the minimum cost to remove all elements from the array.
//  A = [2, 1]
//  Given array A = [2, 1]
//  Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
//  Remove 1 from the array => []. Cost of this operation is (1) = 1.
//  So, total cost is = 3 + 1 = 4.
  
public class Solution {
    public int solve(int[] A) {

        Arrays.sort(A);
        reverse(A);
       
        /*int rightSum[] = new int[A.length];
        int sum = 0;

        for(int i= A.length-1; i >=0;i--){
            sum = sum + A[i];
            rightSum[i] = sum;
            //System.out.print("sum: "+ rightSum[i]);
        }

        int total = 0;
        for(int i= 0; i <A.length;i++){
           total+= rightSum[i];
        }
    return total;
*/

//Another approach- Contribution of each element in such case will be - element*(i+1)
//9,7,6,3,2,1 - To find min cost, remove largest element first. So 0th element will be used 1 time so i+1.
    
    int ans = 0;
    for(int i=0;i<A.length; i++){
        ans = ans + (i+1)*A[i];
    }
    return ans;

    }

   void reverse(int[] A){
        int i=0;
        int j= A.length -1;

        while(i < j){
         int temp = A[i];
         A[i] = A[j];
         A[j] = temp;
         i++;
         j--;
        }
    }
}
