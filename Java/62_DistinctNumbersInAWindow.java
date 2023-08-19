// You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

// Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

// NOTE: if B > N, return an empty array.
// A = [1, 2, 1, 3, 4, 3]
// B = 3
// [2, 3, 3, 2]

public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        
       ArrayList<Integer> list = new ArrayList<>();
       
       Map<Integer,Integer> mp = new HashMap<>();
       for(int i=0; i< B;i++) {
           Integer num = A.get(i);
           mp.put(num, mp.getOrDefault(num,0)+1);  
       }

        list.add(mp.size());
        
        int si = 0;  // we need to get 1 element less than start
        int ei = B;  // we need to get element at the end
        int loopTill = A.size();

        while(ei < loopTill) {//0,1,2,3
              int freq = mp.get(A.get(si));
              int newFreq = freq - 1;
              mp.put(A.get(si),newFreq);  

              if(newFreq <= 0)
                mp.remove(A.get(si));

                // add in map
            mp.put(A.get(ei), mp.getOrDefault(A.get(ei), 0) + 1);
            si++;
            ei++;
            list.add(mp.size());
    }
      return list;
    }
}
