// Given an array A of non-negative integers, arrange them such that they form the largest number.

// Note: The result may be very large, so you need to return a string instead of an integer.
//  A = [3, 30, 34, 5, 9]
//  "9534330"

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {

        if(containsAllZeroes(A)) return "0";
        List<String> str=new ArrayList<>();
        
        A.forEach(i -> str.add(Integer.toString(i)));
        //compare x, y ---> if(y+x) > (x+y) means y greater than x, eg [22, 9]--> 922>229-->output[922]
        Collections.sort(str, new Comparator<String>(){
            @Override
            public int compare(String x, String y){
              return (y+x).compareTo(x+y);
            }
        });
       
       StringBuilder builder = new StringBuilder();
       str.forEach(i -> builder.append(i));
       return builder.toString();
    }
   
    public boolean containsAllZeroes(List<Integer> list) {
        for (int num : list) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
