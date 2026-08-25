//Problem: Richest Customer Wealth — LeetCode 1672
//Pattern: 2D Array Traversal
//Time: O(m × n) | Space: O(1)
public class richestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        
        int maxWealth = 0;
        for(int[] numbers: accounts) {
            int wealth = 0;
            for(int number: numbers) {
                wealth += number;
            }
            if(wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
