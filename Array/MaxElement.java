// Problem: Maximum Element in Array
// Pattern: Single Pass Array Scan
// Time: O(n) | Space: O(n)
// Signal: Looking for an extreme value (max/min) in an array? Initialize with the first element and update the answer while traversing the remaining elements.
package Array;
import java.util.Scanner;

class MaxElement{

    public static void main(String [] args){
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int [] nums = new int [n];
        nums[0] = input.nextInt();
        int max = nums[0];
        for(int i = 1; i < n; i++){
            nums[i] = input.nextInt();
            if(max < nums[i])
                max = nums[i];
        }
        System.out.println(max);
        input.close();
    }
}