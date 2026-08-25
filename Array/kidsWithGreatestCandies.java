// Problem: Kids With the Greatest Number of Candies (LeetCode-1431)
// Pattern: Find Maximum + Array Traversal
// Time: O(n) | Space: O(n)
// Signal: Need to compare every element with the largest value? Find the maximum first, then check each element against it.

import java.util.Arrays;
import java.util.List;

public class kidsWithGreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        Boolean[] ans = new Boolean[candies.length];
        
        for(int i = 0; i < candies.length; i++) {
            if(max < candies[i]) {
                    max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++) {
            if((candies[i] + extraCandies) >= max) {
                ans[i] = true;
            }
            else {
                ans[i] = false;
            }
        }
        return Arrays.asList(ans);
    }
}
