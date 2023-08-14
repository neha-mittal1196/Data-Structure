// Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
// You may assume that the array is non-empty and the majority element always exists in the array.

// [2, 1, 2]
// 2

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        int n = A.length;
       //Brute force - TC - O(N^2), SC- O(1)
        /*for(int i=0;i< A.length;i++){
            int freq = 0;
            for(int j=0;j< A.length;j++){
                if(A[i] == A[j]) {
                   freq++;
                }
           }

           if(freq > n/2){
               return  A[i];
           }
        }
    return -1;*/

   //2nd approach-  TC - O(N), SC- O(N)
   /* Map<Integer, Integer> mp = new HashMap<>();
    for(int i=0;i< n;i++){
        mp.put(A[i],mp.getOrDefault(A[i],0)+1);
    }

    for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
         if(entry.getValue() > n/2)
           return entry.getKey();
    }
    return -1;
    }*/

    //3rd approach-  TC - O(N), SC- O(1)- MOORE'S VOTING ALGORITHM
    // Approach is to consider every element as majority element. If next element is same as majority element, increment the freq else reduce the freq.
    // Once freq becomes 0, take new element as majority element.
    int majorityElement = A[0];
    int freq = 1;

    for(int i=1;i< n;i++){
      if(A[i] == majorityElement){
        freq++;
      } else {
           if(freq == 0){
               majorityElement = A[i];
               freq = 1;
           }  
           else{
               freq--;
           } 
        }   
    }
    
      int maxFreq = 0;
      for(int i=0; i<A.length; i++){
       if(A[i] == majorityElement){
            maxFreq++;
         }
       }
       
       if(maxFreq > A.length/2){
            return majorityElement;
        }

        return -1;
    }

}
