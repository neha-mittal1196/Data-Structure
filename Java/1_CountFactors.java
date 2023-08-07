//Given an integer A, you need to find the count of it's factors.
//Factor of a number is the number which divides it perfectly leaving no remainder.
//Example : 1, 2, 3, 6 are factors of 6

public class Solution {
    public int solve(int A) {

   //1st approach - Take all the numbers from 1 to number N. Iterate over them and check if remainder is 0. 
    int factorCount = 0;
      
    for(int i=1;i<=A; i++){
          if(A%i == 0)
            factorCount++;
    }

    return factorCount;

    //2nd approach - We know factors start repeating itself after a certain point. There can be 2 numbers.
    // one - perfect square and one - not perfect square
    //100- 1*100, 2*50, 4*25, 5*20, 10*10, 20*5, 25*4, 50*2, 100*1
    //60- 1*60, 2*30, 3*20, 4*15, 5*12, 6*10, 10*6, 12*5, 15*4, 20*3, 30*2, 60*1 

    int factorCount = 0;
      
    for(int i=1;i*i<=A; i++){
          if(A%i == 0) {
              if(i*i == A){
                factorCount++;
              } else
               factorCount = factorCount + 2;
        }
    }

    return factorCount;
    }
}
