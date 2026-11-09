// Problem: Check If Two String Arrays are Equivalent (LeetCode-1662)
// Pattern: Two Pointers (String Traversal)
// Time: O(min(N, M)) | Space: O(1)
// Signal: Need to compare two strings stored across multiple arrays? Use independent pointers to traverse characters directly without constructing combined strings.
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        int i = 0, j = 0;
        int w1 = 0, w2 = 0;

        while(i < word1.length && j < word2.length) {

            if(word1[i].charAt(w1) != word2[j].charAt(w2)) {
                return false;
            }
            
            w1++;
            w2++;

            if(w1 == word1[i].length()) {
                i++;
                w1 = 0;
            }

            if(w2 == word2[j].length()) {
                j++;
                w2 = 0;
            }
        }

        return i == word1.length && j == word2.length;
    }
}