// Problem: Squares of a Sorted Array (LeetCode 977)
// Pattern: Two Pointers
// Time: O(n) | Space: O(n)
// Signal: Need to process elements from both ends of a sorted array? Compare both ends and place the larger value in its correct position.
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        int j = n - 1;
        int k = n - 1;

        for(int m = 0; m < n; m++) {
            nums[m] = nums[m]*nums[m];
        }
        while(i < j) {
            if(nums[i] < nums[j]) {
                ans[k--] = nums[j--];
            }
            else {
                ans[k--] = nums[i++];
            }
        }
        ans[k] = nums[i];
        return ans;
    }
}