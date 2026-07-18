package Strings;
// Problem: Jewels and Stones
// Pattern: Lookup Table / Character Marking
// Time: O(n) | Space: O(1)
// Signal: Need to repeatedly check whether an item belongs to a small set? Mark all valid items first, then use fast lookups instead of searching every time.
public class jewelsStones {
    public int numJewelsInStones(String jewels, String stones) {

        boolean[] istrue = new boolean[124];
        int count = 0;

        for(int i = 0; i < jewels.length(); i++) {
            istrue[jewels.charAt(i)] = true;
        } 

        for(int i = 0; i < stones.length(); i++) {
            if(istrue[stones.charAt(i)] == true) {
                count++;
            }
        }
        return count;
    }
}
