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


//Approach2 - Store no of elements greater than that element in a map. Check if key and value of map is equal, then add the count.
      Arrays.sort(A);  //5,2,6 -> 2,5,6  
      int cntOfNobleIntegers = 0;
      int n = A.length;
      Map<Integer, Integer> mp = new HashMap<>();
      for(int i=0; i< n; i++){
        mp.put(A[i], n-1-i);  // 2 -> 2, 5 -> 1, 6 -> 0
     }
     
     for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
          if(entry.getKey() == entry.getValue())
           cntOfNobleIntegers++;
     }
     if(cntOfNobleIntegers == 0)
       return -1;

     return cntOfNobleIntegers;
}
