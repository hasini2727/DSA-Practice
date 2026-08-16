// Problem: Number of Good Pairs (LeetCode-1512)
// Pattern: Frequency Counting / Incremental Counting
// Time: O(n) | Space: O(1)
// Signal: Need to count pairs of equal elements? Track previous occurrences and add them to the pair count.
class Solution {
    public int numIdenticalPairs(int[] nums) {

        int[] frequency = new int[101];
        int count = 0;

        for(int num:nums) {
            count += frequency[num];
            frequency[num]++;
        }
        return count;
    }
}