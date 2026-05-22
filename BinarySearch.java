//Problem: Binary Search
//Pattern: Binary Search
//Time: O(log n) | Space: O(1)
//Signal: Sorted array + searching target? Check middle element and reduce search space by half.
class Solution {
    public int search(int[] nums, int target) {
        int mid, l, r;
        l = 0;
        r = (nums.length)-1;
        mid = (l + r)/2;
        while(l <= r){
            mid = (l + r)/2;
            if(nums[mid] == target){
                for(int i = 0; i < nums.length; i++){
                    if (nums[i] == target){
                        System.out.println(i);
                        return i;
                    }
                }
            }
            else if(nums[mid] > target)
                r = mid - 1;
            else if(nums[mid] < target)
                l = mid + 1;
            else
            return -1;
        }
        return -1;
    }
}