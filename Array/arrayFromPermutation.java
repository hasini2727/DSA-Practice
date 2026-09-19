// Problem: Build Array from Permutation
// Pattern: Array Index Mapping / Direct Indexing
// Time: O(n) | Space: O(n)
// Signal: When an array value can be used as another valid index, use it directly to access the required value instead of searching.
class arrayFromPermutation {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}