package Array;
// Problem: Move Zeroes
// Pattern: Two Pointers(In-place array rearrangement)
// Time: O(n) | Space: O(1)
// Signal: Need to preserve relative order while grouping elements? Maintain a write pointer and place non-zero elements forward.
class MoveZeroes {
    public void moveZeroes(int[] nums) {
            int p = 0;
             for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                        int temp = nums[i];
                        nums[i] = nums[p];
                        nums[p] = temp;
                        p++;
                }
            }
        return;
    }
}
 
    