//Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].

public class Solution {
  
    //Brute force - swap 0th and nth element and so on- Input is a List [ TC- O(N)]
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {

        while(B < C){
            int temp = A.get(B);
            A.set(B,A.get(C));  // This is very imp.
            A.set(C,temp);
            B++;
            C--;
        }

        return A;
    }
}


  
public class Solution {
    //Brute force - swap 0th and nth element and so on - Input is an array [ TC- O(N) ] 
    public int[] solve(int[] A, int B, int C) {

      while(B < C){
           int temp = A[B] ;
           A[B] = A[C];
           A[C] = temp;
           B++;
           C--;
       }
       return A;

    }
}

