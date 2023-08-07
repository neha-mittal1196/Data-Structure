//Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.

public class Solution {
    public int[] solve(int[] A, int B) {

     if(B > A.length)
        B= B%A.length;

     reverse(A, 0, A.length-1);
     reverse(A, 0, B-1);
     reverse(A, B, A.length-1);
     return A;
    }

    public void reverse(int [] a, int si, int ei){

        while(si < ei){
         int temp = a[si];
         a[si] = a[ei];
         a[ei] = temp;
         si++;
         ei--;
        }
    }
}
