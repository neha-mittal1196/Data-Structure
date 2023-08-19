// You are given a string A of size N.

// Return the string A after reversing the string word by word.

// NOTE:

// A sequence of non-space characters constitutes a word.
// Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
// If there are multiple spaces between words, reduce them to a single space in the reversed string.

// A = "the sky is blue"
// "blue is sky the"

public class Solution {
    public String solve(String A) {
    
    List<String> list = new LinkedList<>();
    
     A = A.trim();
     for(String x : A.split(" ")){
       list.add(x);
     }

    StringBuilder sb = new StringBuilder();

    for(int i = list.size()-1; i >=0; i--){
        sb.append(list.get(i) + " ");
    }

    return sb.toString().trim();

    }
}
