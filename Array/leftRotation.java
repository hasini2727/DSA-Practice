
// Problem: Left Rotate Array
// Pattern: Array Rotation using Reversal Technique
// Time: O(n) | Space: O(1)
// Signal: Need to rotate an array while satisfying O(1) extra space? Rearrange elements inside the same array instead of using another array.import java.util.Scanner;
import java.util.Scanner;
public class leftRotation {
    
    static void reverse(int [] arr, int left, int right){
        while(left < right){
            
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        int n = input.nextInt();
        int k = input.nextInt();
        
        if(n > 0)
            k = k % n;
            
        int [] arr = new int [n]; 
       
        for(int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
       
        input.close();
    }
}