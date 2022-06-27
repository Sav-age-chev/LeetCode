/* My initial solution (Time complexity: O(n), Space complexity: O(1)) */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // Decresing array length by 1 to be able to use the integer for index back to front
        m--;
        n--;
        
        for (int i=0;i<nums1.length; i++) {
            
            // Comparing array numbers and adding the largest value to nums1 array back to front
            if (m>=0 && n>=0 && nums1[m]>=nums2[n]) {
                nums1[nums1.length-1-i] = nums1[m];
                m--;
            } else if (n>=0) {
                nums1[nums1.length-1-i] = nums2[n];
                n--;
            } else {
                nums1[nums1.length-1-i] = nums1[m];
                m--;
            }
        }
    }
}