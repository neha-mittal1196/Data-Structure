// Given an array of integers A and an integer B.
// Find the total number of subarrays having sum equals to B.
// A = [1, 0, 1]
// B = 1
// 4

//Similar to Subarray with sum 0. There we need to just tell whether there exists a subarray or not. Only diff is mp.containsKey(sum-B) and mp.containsKey(sum)

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
    int n = A.size();

    Map<Integer,Integer> mp = new HashMap<>();
    mp.put(0,1);
    int sum = 0;
    int ans = 0;
   
    for(int i=0;i<n;i++)
    {
           sum+=A.get(i);
           if(mp.containsKey(sum-B))
           {
               ans+= mp.get(sum-B);
           }
           mp.put(sum,mp.getOrDefault(sum,0)+1);
    }
    return ans;
  }
}
