// Given two binary strings A and B. Return their sum (also a binary string).
// A = "100"
// B = "11"
// "111"

// A = "110"
// B = "10"
// "1000"


//Approach is take last chars of A and B. Add them and get sum and carry. If carry is there, add in the next turn.
// 2 mistakes - while loop should run for OR condition not AND condition and lets say the length of any string becomes 0 in tht case take every char as 0.
public class Solution {
    public String addBinary(String A, String B) {

       int lenA = A.length()-1;
       int lenB = B.length()-1;

       int carry = 0;
       StringBuilder sb = new StringBuilder();

       while(lenA >= 0 || lenB >= 0){
           int a = lenA>=0 ? A.charAt(lenA) - '0' :0;
           int b = lenB>=0 ? B.charAt(lenB) - '0' :0;
           int sum = carry + a + b;

           carry = sum/2;
           sb.append(sum%2);
           lenA--;
           lenB--;
       }
      
        if(carry > 0)
        sb.append(carry);

        return sb.reverse().toString();
    }
}
