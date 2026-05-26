// Problem: Frequency Count of Array Elements
// Pattern: HashMap / Frequency Counting
// Time: O(n) | Space: O(n)
// Signal: Need fast count updates? Use a HashMap to store occurrences while traversing once.
import java.util.Scanner;
import java.util.HashMap;

public class FrequencyCounter{
    public static void main(String [] args){
        HashMap <Integer, Integer> map = new HashMap <> ();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of the map: ");
        int size = input.nextInt();

        for(int i = 0; i < size; i++){
            System.out.println("Enter number: ");
            int a = input.nextInt();
            if(map.containsKey(a)){
                int count = map.get(a);
                count++;
                map.put(a, count);
            }
            else
            map.put(a, 1);
        }

        System.out.println("The frequency count of given array is ");
        System.out.println(map);
        input.close();
    }
}