// [1,2,3,4]
// [5,6,7,8]
// [9,2,3,4]

//[10,26,18]

public class Solution {
    public int[] solve(int[][] A) {

        int rowLen = A.length;
        int colLen = A[0].length;
        int ans[] = new int[rowLen];

        for(int i=0; i<rowLen;i++){
            int sum = 0;
            for(int j=0; j<colLen; j++){
              sum = sum + A[i][j];
            }
           ans[i] = sum;
        }
        return ans;
    }
}
