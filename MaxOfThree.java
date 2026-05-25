// Problem: Find Maximum of Three Numbers
// Pattern: Math Comparison (Nested Math.max)
// Time: O(1) | Space: O(1)
// Signal: Need to compare multiple values and print clean integer output if no decimal part exists? Use nested Math.max and type checking.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        double max;
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        max = Math.max(A, Math.max(B, C));

        if (max == (long)max)
            System.out.println((long)max);
        else
            System.out.println(max);
    }
}