public class Solution {
    public int solve(int A) {

  //2 variations to this question- 
  //1st- Return sqrt(N) in case its a perfect square or -1 in case not a perfect square.
  //Brute force - i*i == A 

     for(int i=0; i*i <=A; i++){
         if(i*i == A)
           return i;
     }
      return -1;

//2nd- Return sqrt(N) in case its a perfect square or floor(sqrt(N)) in case not a perfect square.
//In case not a perfect square, store one previous value.
    int i=1;
    int ans = 0;
    while( i*i <= A){
         ans = i;
         i++;
    }
    return ans; 
    }
}
