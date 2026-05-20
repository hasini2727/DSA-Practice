import java.util.Scanner;

// Problem: Factorial of N
// Pattern: Recursion
// Time: O(n) | Space: O(n) 
// Signal: Breaking a problem down into identical subproblems? Define a base case to stop, and a recursive step to scale down.
import java.util.Scanner;
class Main {
    long fact(long n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        Main obj = new Main();
        long n = obj.fact(num);
        System.out.println(n);
    }
}