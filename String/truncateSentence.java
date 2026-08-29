package String;
// Problem: Truncate Sentence (LeetCode-1816)
// Pattern: String Traversal / Linear Scan
// Time: O(n) | Space: O(1)
// Signal: Need only the first k words? Scan until the kth space and return the part before it.
class Solution {
    public String truncateSentence(String s, int k) {
        
        int i, scount = 0; 

        for(i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                scount++;
            }
            if(scount == k) {
                break;
            }
        }
        if(i == s.length()) {
            return s;
        }
        return s.substring(0, i);
    }
}