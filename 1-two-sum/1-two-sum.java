class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] output = new int[2];
        
        for (int i=0; i<nums.length; i++) {
            output[0] = nums[i];
            for (int k=0; k<nums.length; k++) {
                if (k!=i) {
                    output[1] = nums[k];
                    if (output[0]+output[1]==target) {
                        output[0] = i;
                        output[1] = k;
                        return output;
                    } 
                }
            }
        }
        return output;
    }
}