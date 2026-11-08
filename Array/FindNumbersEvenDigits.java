// Problem: Find Numbers with Even Number of Digits (LeetCode-1295)
// Pattern: Array Traversal / Conditional Counting
// Time: O(n) | Space: O(1)
// Signal: Need to count elements satisfying a digit-based condition? Traverse the array once and increment the count whenever an element meets the condition.
class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(n >= 10 && n < 100) {
                count++;
            }
            else if(n >= 1000 && n < 10000) {
                count++;
            }
            else if(n == 100000) {
                count++;
            }
        }
        return count;
    }
}