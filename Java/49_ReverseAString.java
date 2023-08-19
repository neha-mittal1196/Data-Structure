// Given a string A, you are asked to reverse the string and return the reversed string.
//  A = "scaler"
//  "relacs"
public class Solution {
    public String solve(String A) {

       StringBuilder sb = new StringBuilder();
       for(int i= A.length()-1; i>=0; i--){
            sb.append(A.charAt(i));
       }

       return sb.toString();

    }
}
