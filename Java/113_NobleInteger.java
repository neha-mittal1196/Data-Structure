// Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
//  A = [3, 2, 1, 3]
//  1
//  For integer 2, there are 2 greater elements in the array..
  
public class Solution {
    public int solve(int[] A) {

        Arrays.sort(A);
        reverse(A);

        //0,0,0,0,-1,-2,-3
        int ans = 0;

        if(A[0] == 0)
          ans++;

        for(int i=1; i< A.length; i++){
           if(A[i]== A[i-1]) {
               continue;
           }
           
            if(A[i] == i){
              ans++;    
            }
        }
       
       if(ans ==0)
         return -1;
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
