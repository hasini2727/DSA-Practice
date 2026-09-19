// Problem: Create Target Array in the Given Order
// Pattern: Array Insertion + Right Shifting
// Time: O(n²) | Space: O(n)
// Signal: Need to insert elements at specific positions while preserving order? Shift existing elements right to make space, then insert the new element.
class createTargetArrayInGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int[] target = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }

        return target;
    }
}