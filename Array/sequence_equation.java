// Problem: Permutation Equation (HackerRank)
// Pattern: Permutation + Inverse Mapping / Position Mapping
// Time: O(n) | Space: O(n)
// Signal: Need to repeatedly find the position of a value? Store each value's position first, then use the position mapping to find the required result quickly.
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


    public static List<Integer> permutationEquation(List<Integer> p) {
    // Write your code here
        int n = p.size();
        int[] arr = new int[n + 1];
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr[p.get(i)] = i + 1;
        }
        for(int i = 1; i <= n; i++) {
            ans.add(arr[arr[i]]);
        }
        return ans;
    }

}