package Array;
// Problem: Second Largest Element in an Array
// Pattern: Single Pass Tracking 
// Time: O(n) | Space: O(1)
// Signal: Need top 2 values in a stream? Don’t sort. Track max and second max in one pass, updating them when a new max or second max appears.

import java.util.Scanner;
public class SecondMax {
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
       int n = input.nextInt();
       
       int max = input.nextInt();
       int max2 = input.nextInt();
       
       if(max < max2){ 
           int temp = max2; 
           max2 = max; 
           max = temp; 
        }
       
       for(int i = 2; i < n; i++){
           int num = input.nextInt();
           
           if(max < num){
            max2 = max;
            max = num;
           }
           
           else if(max2 < num && num < max){ 
               max2 = num;
            }
       }
        System.out.println(max2);
        input.close();
    }
}