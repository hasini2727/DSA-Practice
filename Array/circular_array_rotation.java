// Problem: Circular Array Rotation (HackerRank)
// Pattern: Array Indexing + Modular Arithmetic (Circular Indexing)
// Time: O(q) | Space: O(1)
// Signal: Need to find values after circular shifts? Map each queried index back to its original position using modulo instead of rotating the array.

import java.util.*;

class Result {



    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
        int n = a.size();
        k = k % n;
        for(int i = 0; i < queries.size(); i++) {
            int q = queries.get(i);
            int index = (q - k + n) % n;
            queries.set(i, a.get(index));
        }
        return queries;
    }

}