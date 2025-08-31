//Possible non duplicate subsets for an array of integers
//There are two ways to solve this problem -
//1. One is via iterating over each element and keep a track while moving to next element.
//2. Another way is - There are only two possibilities, either the element will be present or not. Iterate over each index and one time take that element, next time dont take the element.


//1. 1st way
public class Solution {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<Integer> subset = new ArrayList<>();
        int visited[] = new int[A.size()];
        findSubsets(A, subset, visited );
        return list;
    }

    void findSubsets(ArrayList<Integer> A, ArrayList<Integer> subset, int visited[]) {
        // System.out.println("index is : "+ index);
        // System.out.println("Subset is : "+ subset);
        ArrayList<Integer> newSubset = new ArrayList<>();
        newSubset.addAll(subset);
        list.add(newSubset);
        // System.out.println("list is : "+ list);
       

        if(subset.size() == A.size()) {
            return;
        }

        for(int i=0; i< A.size(); i++) {
            if(visited[i] ==0 && (subset.size() == 0 || A.get(i) > subset.get(subset.size()-1))) {
                visited[i] = 1;
                subset.add(A.get(i));
                findSubsets(A, subset, visited);
                visited[i] = 0;
                subset.remove(subset.size()-1);
            }
        }
    }
}


//2nd way - Here while going down itself we can add the elements in final subsets.

public class Solution {
    ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
    ArrayList<Integer> currentSet = new ArrayList<>();
    int n;

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {

        //No of elements = n Total Sets possible = 2^n
        n = A.size();
        Collections.sort(A);
        subsets.add(new ArrayList<Integer>());
        findSubset(A, 0);
        return subsets;
    }

    void findSubset(ArrayList<Integer> A, int index) {
        if(index == n) {
            return;
        }

        //Take
        currentSet.add(A.get(index)); //This is important for lexographical order
        subsets.add(new ArrayList<Integer>(currentSet));
        findSubset(A,index+1);
        currentSet.remove(currentSet.size()-1);
        
        //Not take case
        findSubset(A,index+1);

    }
}

