// You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

// You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
//  A = "tHiSiSaStRiNg" 
//  ThIsIsAsTrInG

//Ascii A-Z 65-90, a-z 97-122, 0-9 48-57

public class Solution {
    public String solve(String A) {

        StringBuilder sb = new StringBuilder();

         for(int i=0; i< A.length(); i++){
           int c = A.charAt(i);
           if(c >=65 && c<=90){
               sb.append((char) (c + 32));
           }else{
              sb.append((char) (c - 32));
           }
        }

    return sb.toString();
    }
}
