//Given an array A of N integers. 
//Count the number of elements that have at least 1 elements greater than itself.
  
public class Solution {
    public int solve(ArrayList<Integer> A) {

      // Brute force - O(N)
      int max = A.get(0);
      int count = 0;

      for(int i=1;i< A.size();i++){
          if(A.get(i) > max)
              max = A.get(i);
      }

      for(int i=0;i< A.size();i++){
        if(A.get(i) != max)
          count++;
    }

    return count;
    }
}
