//A wire connects N light bulbs.
//Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
//Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
//You can press the same switch multiple times.
//Note: 0 represents the bulb is off and 1 represents the bulb is on.
// A = [0, 1, 0, 1]
// press switch 0 : [1 0 1 0], press switch 1 : [1 1 0 1], press switch 2 : [1 1 1 0], press switch 3 : [1 1 1 1]
//Output - 4

//Approach is once the switch is pressed odd number of times, all the right side bulb's state is opposite of whats actually present in the array.
//If present even no of times, state of bulb is same as present in the array
public class Solution {
    public int bulbs(int[] A) {
     
    int switchCount = 0;

     for(int i=0; i < A.length; i++){

        if(switchCount%2 ==0) {
            if(A[i] == 0)
               switchCount++; 
        } else {
            if(A[i] == 1)
                switchCount++;
        }
     }
       return switchCount;
    }
}
