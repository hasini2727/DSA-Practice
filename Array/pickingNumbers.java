// Problem: Picking Numbers
// Pattern: Frequency Array / Counting
// Time: O(n) | Space: O(1)
// Signal: Need to find the largest group where the difference between any two elements is at most 1? Count the frequency of each number and check adjacent values.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int count = 0, maxCount = 0;
        int[] freq = new int[101];
        for(int i = 0; i < a.size(); i++) {
            freq[a.get(i)]++;
        }
        for(int i = 0; i < 100; i++) {
            count += freq[i] + freq[i+1];
            maxCount = Math.max(count, maxCount);
            count = 0;
        }
        return maxCount;
    }

}