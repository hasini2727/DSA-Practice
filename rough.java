import java.util.*;
class rough {
    public static void main (String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4, i   = 0, j = 0;
        int[] arr = new int[n * 2];
        
        while(j < n){
            arr[i++] = nums[j];
            arr[i++] = nums[j + n];
            j++;
        }
        for(int ele = 0; ele < n * 2; ele++){
        System.out.print(arr[ele] + " ");
        }

    }
}