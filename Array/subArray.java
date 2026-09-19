// Problem: Subarray Division (HackerRank)
// Pattern: Sliding Window
// Time: O(n) | Space: O(1)
// Signal: Need to check sums of fixed-size consecutive subarrays? Maintain the current window sum by removing the outgoing element and adding the incoming element.

import java.util.*;

class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0, sum = 0;
        for(int i = 0; i < m ; i++){
            sum += s.get(i);
        }
        
        if(sum == d) {
            count++;
        }
        
        for(int i = m ; i < s.size(); i++) {
            sum = sum + s.get(i) - (s.get(i - m)); 
        
            if(sum == d) {
                count++;
            }
        }

        return count;
    }

}