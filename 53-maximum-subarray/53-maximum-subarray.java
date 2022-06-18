/* My initial solution (Time Complexity: O(n^2), Space Compleity: O(1)) */
// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         // Initialising variableas
//         int maxSubSum = Integer.MIN_VALUE;
        
//         // Looping through the given array
//         for (int i=0; i<nums.length; i++) {
            
//             // set temp array
//             int tempSubSum = 0;
            
            
//             // Looping through the given array from starting point i to the end while comparing to get the max value
//             for (int j=i; j<nums.length; j++) {
//                 tempSubSum += nums[j];
//                 maxSubSum = Math.max(maxSubSum, tempSubSum);
//                 if (0>tempSubSum) {
//                     tempSubSum = 0;
//                 }
//             }
//         }
        
//         // Return max sum
//         return maxSubSum;
//     }
// }

/* LeetCode optimised solution (Time Complexity: O(n), Space Compleity: O(1))
 * Dynamic Programming, Kadane's Algorithm 
 */
class Solution {
    public int maxSubArray(int[] nums) {
        
        // Initialize our variables using the first element.
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];
        
        // Start with the 2nd element since we already used the first one.
        for (int i = 1; i < nums.length; i++) {
            
            int num = nums[i];
            
            // If current_subarray is negative, throw it away. Otherwise, keep adding to it.
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }
        
        return maxSubarray;
    }
}
 