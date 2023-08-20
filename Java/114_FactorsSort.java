// You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of each element, i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. If 2 elements have same number of factors, then number with less value should come first.

// Note: You cannot use any extra space
// A = [6, 8, 9]
// The number 9 has 3 factors, 6 has 4 factors and 8 has 4 factors.
  
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {

    Collections.sort(A, new Comparator<Integer>(){
      @Override
      public int compare(Integer a, Integer b){
        Integer aFactors = getNumberOfFactors(a);
        Integer bFactors = getNumberOfFactors(b);

      
     if(aFactors == bFactors){
         return a - b;
        /*if(a > b)
          return 1;

        return -1; */
      }
      return aFactors - bFactors;
}});
  return A;
    }

    public Integer getNumberOfFactors(Integer a){
    Integer count = 0;
    for(int i = 1; i*i<=a; i++){
       if(a%i == 0 ){
          if( i*i == a)
            count++;
          else
            count += 2;
       }  
    }
  return count;
}
}
