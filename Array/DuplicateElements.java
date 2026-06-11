// Problem: Remove Duplicates from Array
// Pattern: Duplicate Detection / Seen-Before Checking (Brute Force Array Approach)
// Time: O(n²) | Space: O(n)
// Signal: Need to keep only unique elements? Check whether the current element has appeared before among accepted elements. Constraints like N ≤ 100000 are a clue to look for a faster lookup-based approach later.

import java.util.Scanner;
public class DuplicateElements {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int [] nums = new int [n];
        int k = 0;
        
        if(n > 0){
            nums[0] = input.nextInt();
            System.out.print(nums[0] + " ");
        
            for(int i = 1; i < n; i++){
                int num = input.nextInt();
                int count = 0;
            
                for(int j = 0; j < k+1; j++){
                    if( num == nums[j]){
                    count++;
                    break;
                    }
                }
            
                if(count == 0){
                    k++;
                    nums[k] = num;
                    System.out.print(nums[k] + " ");
                }
            }
            
        }
        input.close();
    }
}