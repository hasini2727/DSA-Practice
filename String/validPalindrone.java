package String;
// Problem: Valid Palindrome (LeetCode 125)
// Pattern: Two Pointers
// Time: O(n) | Space: O(1)
// Signal: Need to compare elements from both ends while skipping invalid characters? Use two pointers and move inward.
class Solution {
    public boolean isPalindrome(String s) {

        int i = 0, j = s.length() - 1;

        while(i < j) {

            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}