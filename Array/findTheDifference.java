// Problem: Find the Difference(LeetCode-389)
// Pattern: Frequency Counting
// Time: O(m+n) | Space: O(1)
// Signal: Need to compare the frequencies of items in two inputs? Count their occurrences and find the one with a different count.
class solution {
    public char findTheDifference(String s, String t) {
        int[] s1 = new int[123];

        for(int i = 0; i < s.length(); i++) {
            s1[s.charAt(i)] += 1; 
            s1[t.charAt(i)] -= 1;
        }
        s1[t.charAt(t.length()-1)] -= 1;

        for(int i = 0; i < t.length(); i++) {
            if(s1[t.charAt(i)] != 0) {
                return t.charAt(i);
            }
        }
        
        return ' ';
    }
}