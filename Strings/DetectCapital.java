package Strings;
// Problem: Detect Capital
// Pattern: String Traversal / Character Counting
// Time: O(n) | Space: O(1)
// Signal: Need to verify a pattern based on character types? Traverse once and count the required characters.
class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int upperCaseCount = 0;
        for(int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                upperCaseCount++;
            }
        }
        return upperCaseCount == word.length() || upperCaseCount == 0 || (upperCaseCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}

