//Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
//An element is a leader if it is strictly greater than all the elements to its right side.
//NOTE: The rightmost element is always a leader
public class Solution {
    public int[] solve(int[] A) {

       ArrayList<Integer> leaderArrayList = new ArrayList<Integer>();
       int n = A.length;
       int max = A[n-1];

       leaderArrayList.add(max);

       for(int i=n-2; i>=0; i--){
        
        if(A[i] > max){
          max = A[i];
          leaderArrayList.add(A[i]);
        }

        }
        int arr[] = new int[leaderArrayList.size()];

        for(int i=0; i< arr.length; i++){
            arr[i]= leaderArrayList.get(i);
        }
    return arr;

    }
}
