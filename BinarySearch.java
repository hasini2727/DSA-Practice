//Problem: Binary Search
//Pattern: Binary Search
//Time: O(log n) | Space: O(1)
//Signal: Sorted array + searching target? Check middle element and reduce search space by half.
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = (l + r)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                r = mid -1;
            else 
                l = mid + 1;
        }
        return -1;
    }
}