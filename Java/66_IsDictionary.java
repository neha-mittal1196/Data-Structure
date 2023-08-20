// Surprisingly, in an alien language, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

// Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.
//  A = ["hello", "scaler", "interviewbit"]
//  B = "adhbcfegskjlponmirqtxwuvzy"
// 1

//'hem','he' return 0
//'he','hem' return 1
//'a','he' return 0

//Approach is two take first two strings. Compare chars of both the strings. At any point lets say char of A is less than char of B then compare next two strings.
//Lets say char of A is equal to char of B then keep on going till chars are matched. Lets say all chars are matched, then we should check len of first string should not be greater than len of 2nd string. //Edge case.
public class Solution {
    public int solve(ArrayList<String> A, String B) {

    //If no of strings is 1, return 1.
    if(A.size() == 1)
      return 1;

    //Put all the characters in hashmap in the given order
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0;i < B.length(); i++){
        map.put(B.charAt(i), i);
    }

    for(int i=0;i < A.size()-1; i++){

        String firstString = A.get(i);
        String secondString = A.get(i+1);

        int len1 = firstString.length();
        int len2 = secondString.length();
        int min = Math.min(len1, len2);
        int flag = 0 ;

        for(int j=0; j< min; j++){
          if(map.get(firstString.charAt(j)) != map.get(secondString.charAt(j))){
                if(map.get(firstString.charAt(j)) < map.get(secondString.charAt(j))){
                    flag = 1;
                    break;
                } else
                    return 0;      
          }       
        }
        
        //case - 'hem', 'he' //Edge case
        if(flag == 0 && len1 > len2){
            return 0;
        }
    } 
    return 1;
  }
}
