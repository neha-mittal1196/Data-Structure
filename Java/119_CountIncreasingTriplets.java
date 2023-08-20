// You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]
// A = [1, 2, 4, 3]
// 2
// The triplets that satisfy the conditions are [1, 2, 3] and [1, 2, 4].

//Approach - Consider every element as the centre. Find elements less than ith element and elements greater than ith element. Multiply to get total ans.
public class Solution {
    public int solve(int[] A) {

    int n = A.length;
    int totalTriplets = 0;

    for(int i=1;i<n-1; i++){
        int numbersLessThanithElement = 0;
        int numbersGreaterThanithElement = 0;
        
        for(int j=0;j<i;j++){
            if(A[j] < A[i]){
                numbersLessThanithElement++;
            }
        }

        for(int j=i+1;j< n;j++){
            if(A[j] > A[i]){
                numbersGreaterThanithElement++;
            }
        }

        totalTriplets = totalTriplets + numbersLessThanithElement*numbersGreaterThanithElement;
    }

    return totalTriplets;

    }
}
