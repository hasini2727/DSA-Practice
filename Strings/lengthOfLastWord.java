package Strings;

// Problem: Length of Last Word
// Pattern: Reverse Traversal (Backward Scanning)
// Time: O(n) | Space: O(1)
// Signal: Answer is near the end? Traverse backward, skip extras, and stop when done.

public class lengthOfLastWord {
    public int Word(String s) {
        int i = s.length() - 1;
        int length = 0;

        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while(i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
