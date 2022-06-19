/* My initial solution (Time Complexity: O(n), Space Compleity: O(1))
 * Dynamic Programming, Kadane's Algorithm 
 */
class Solution {
    public int maxProfit(int[] prices) {
        
        // Initialise array holding values as follow: buy, sell, profit
        int oldPrice = prices[0];
        int minPrice = oldPrice;
        int[] buySellProfit = {oldPrice, 0, 0};
        
        for (int i=1; i<prices.length; i++) {
            
            // New proice data
            int newPrice = prices[i];
            
            if (newPrice < minPrice) {
                minPrice = newPrice;
            }
            
            // Compare best profit so far againt new profit if sell on current date
            if (buySellProfit[2] < newPrice - buySellProfit[0]) {
                buySellProfit[2] = newPrice - buySellProfit[0];
                buySellProfit[1] = newPrice;
            }
            
            // Compare best profit so far againt new profit posibility 
            if (buySellProfit[2] <= newPrice - minPrice) {
                buySellProfit[2] = newPrice - minPrice;
                buySellProfit[1] = newPrice;
                buySellProfit[0] = minPrice;
            }
            
        }
        
        return buySellProfit[2];
    }
}

/* LeetCode optimised solution (Time Complexity: O(n), Space Compleity: O(1))
 * Dynamic Programming, Kadane's Algorithm 
 */
// class Solution {
//     public int maxProfit(int[] prices) {
        
//         int minPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
        
//         for (int i=0; i<prices.length; i++) {
//             if (prices[i]<minPrice) {
//                 minPrice = prices[i];
//             } else if (prices[i] - minPrice > maxProfit) {
//                 maxProfit = prices[i] - minPrice;
//             }
//         }
        
//         return maxProfit;
//     }
// }