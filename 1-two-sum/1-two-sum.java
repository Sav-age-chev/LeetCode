//Optimised solution 2 (Time Complexity: O(n), Space Compleity: O(n))
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

//Optimised solution 1 (Time Complexity: O(n^2), Space Compleity: O(1))
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i=0; i<nums.length; i++) {
//             for (int k=i+1; k<nums.length; k++) {
//                 if (nums[k] == target - nums[i]) {
//                     return new int[] {i, k};
//                 }
//             }
//         }
//         return null;
//     }
// }

//My initial solution (Time Complexity: O(n^2), Space Compleity: O(1))
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
        
//         int[] output = new int[2];
        
//         for (int i=0; i<nums.length; i++) {
//             output[0] = nums[i];
//             for (int k=0; k<nums.length; k++) {
//                 if (k!=i) {
//                     output[1] = nums[k];
//                     if (output[0]+output[1]==target) {
//                         output[0] = i;
//                         output[1] = k;
//                         return output;
//                     } 
//                 }
//             }
//         }
//         return null;
//     }
// }