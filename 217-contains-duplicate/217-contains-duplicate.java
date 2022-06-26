/* My initial solution (Time complexity: O(n), Space complexity: O(n)) */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // Instantiating new hashmap
        Map<Integer, Integer> numbers = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            
            // If number exist in the hashmap already, returns true, else add it
            if (numbers.containsKey(nums[i])) {
                return true;
            } else {
                numbers.put(nums[i],nums[i]);
            }
        }
        // If no duplicates are found, return false
        return false;
    }
}