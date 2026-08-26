// Problem: How Many Numbers Are Smaller Than the Current Number (LeetCode-1365)
// Pattern: Counting / Frequency Array + Prefix Sum
// Time: O(n + k) | Space: O(n + k)
// Signal: Need to repeatedly count how many elements are smaller than each value? → Count frequencies first, then use cumulative counts instead of comparing every pair.
public class howManyNumbersSmallCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] count = new int[101];
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            count[nums[i]] += 1; 
        }

        for(int i = 1; i < count.length; i++) {
            count[i] += count[i-1]; 
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                ans[i] = 0;
                continue;
            }
            ans[i] = count[nums[i] - 1];
        }

        return ans;
    }
}
