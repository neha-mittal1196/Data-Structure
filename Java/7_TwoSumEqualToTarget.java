//Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
//It can have a variation to return indices of the number where sum == target. In that case we need to use hashmap.

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
      
        // Brute force - O(N^2), O(1)
        for(int i=0;i< A.size(); i++){
            for(int j= i+1; j < A.size(); j++){
                  if(A.get(i) + A.get(j) == B)
                     return 1;
            }
        }
        return 0;

        // 2nd approach- Using set- TC- O(N), SC- O(N)
        Set<Integer> set = new HashSet<>();
        for(int i=0;i< A.size(); i++){
           if(set.contains(B - A.get(i))){
              return 1;
           }
           else{
               set.add(A.get(i));
           }
        }

        return 0;

        //3rd approach- Using hashmap - TC- O(N), SC- O(N)

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            int target = B - A.get(i);
            if (map.containsKey(target)) {
                return 1;
            } else {
                map.put(A.get(i), target);
            }
        }
        return 0;

    }
}
