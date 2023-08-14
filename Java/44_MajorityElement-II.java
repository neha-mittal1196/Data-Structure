// You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
// If so, return the integer. If not, return -1.

// If there are multiple solutions, return any one.

// Note: Read-only array means that the input array should not be modified in the process of solving the problem
// [1 2 3 1 1]
// 1

//Approach - watch youtube video.
public class Solution {
    public int repeatedNumber(int[] A) {
        
        int n = A.length;
        if(A.length <= 1)
          return 1;

        int first = A[0];
        int second = A[1];
        int cnt1 = 1;
        int cnt2 = 1;

        for(int i=2; i< n; i++) {
          
          if(A[i] == first){
              cnt1++;
          }
          else if(A[i] == second){
              cnt2++;
          }
          else if(cnt1 == 0){
              first = A[i];
              cnt1 = 1;
          }
          else if(cnt2 == 0){
              second = A[i];
              cnt2 = 1;
          }
          else{
              cnt1--;
              cnt2--;
          }
        }

        cnt1 = 0;
        cnt2 = 0;

        for(int i=0;i<n; i++){
            if(A[i] == first)
              cnt1++;
             if(A[i] == second)
              cnt2++;
        }

        if(cnt1 > n/3)
          return first;

        if(cnt2 > n/3)
          return second;

        return -1;

        
    }
}
