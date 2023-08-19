// Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.
// A = [4, 2, 1, 3]
// [1, 2, 3, 4]

//Another variation to the same problem
// A = [b, d, a, f]
// A = [a, b, d, f]

//Here take int chararr[] = new int[26];
//Store 'a' count at index 0.  chararr[i] = A[i]- 'a'
//While printing, char ch = 'a' + i;

public class Solution {
    public int[] solve(int[] A) {

      //Approach1 - Brute force - Use bubble sort - TC - O(N^2), SC- O(1) 
      //Approach2 - Use inbuilt sort function - O(NlogN)
         //Arrays.sort(A);
         //return A;

     //Approach3- Optimised - Store each number's count in an array. Iterate the array those number of times - //TC- O(N), SC- O(1)

      //Get max element from the array.
       int max = 0;
       for(int i=0;i < A.length; i++) {
          max = Math.max(max,A[i]);
        }

        int countArray [] = new int[max]; //Array size from 0 to max Element-1. If 0 is included take size max+1;
        int ans [] = new int[A.length];

        for(int i=0;i < A.length; i++){
          int index = A[i]-1;
          countArray[index]+=1;  //Store the count of the elements 
        }

        int k = 0;   
        for(int i=0;i < countArray.length; i++) {  //It will run n no of times

           int res = countArray[i];
           for(int j=0; j < res;j++){ //This loop will run only total length of the array times only.
              ans[k++] = i+1;
           }
        }

        return ans;
    }
}
