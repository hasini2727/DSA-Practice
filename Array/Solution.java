// Problem: Plus Minus (HackerRank)
// Pattern: Array Traversal / Counting
// Time: O(n) | Space: O(1)
// Signal: Need to count elements based on conditions? Traverse once and maintain separate counters.
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int n  = arr.size();
        int plus = 0, minus = 0, zero = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr.get(i) > 0) {
                plus++;
            }
            else if(arr.get(i) < 0) {
                minus++;
            }
            else {
                zero++;
            }
        }
        System.out.printf("%.6f\n", (double)plus/n);
        System.out.printf("%.6f\n", (double)minus/n);
        System.out.printf("%.6f\n", (double)zero/n);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
