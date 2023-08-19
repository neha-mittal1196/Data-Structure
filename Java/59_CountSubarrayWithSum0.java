// Given an array A of N integers.

// Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7
// A = [1, -1, -2, 2]
// 3
// The subarrays with zero sum are [1, -1], [-2, 2] and [1, -1, -2, 2].

//Approach- In order to find total subarrays with sum 0, we need to use prefix sum and hashmap instead of hashset.

public class Solution {
    public int solve(ArrayList<Integer> A) {
     //[1, -1, -2, 2]
    //pf -> [1, 0, -2, 0]  --> Before iterating add one 0 so that if at any point sum 0 comes, it means we have that subarray.
    // Lets say again 0 comes there will be 2 subarrays not just 1 for the last 0. [1,-1,-2,2] and [-2,2] so we need to add the frequency came until now.
  
       
    ArrayList<Integer> prefixList = new ArrayList<>();
    int sum = 0;

    for(int i=0;i< A.size();i++) {
      sum = sum + A.get(i);
      prefixList.add(sum);
    }


    Map<Long,Integer> hm = new HashMap<>();
    hm.put(0L,1);

    int cnt=0;
 
    for(int i=0;i< prefixList.size();i++) {
        long elem = (long) prefixList.get(i);

        if(hm.containsKey(elem)){
            int freq = hm.get(elem);
            cnt = cnt + freq;
            hm.put(elem, freq +1);
        }
        else {
            hm.put(elem,1);
        }
    }

    return  cnt%1000000007;
    }
}
