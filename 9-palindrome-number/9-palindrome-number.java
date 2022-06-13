class Solution {
    public boolean isPalindrome(int x) {
        
        if (x<0) {
            return false;
        }
        
        String strValueX = String.valueOf(x);
        
        for (int i=0; i<strValueX.length()/2; i++) {
            if (strValueX.charAt(i)!=strValueX.charAt(strValueX.length()-1-i)) {
                return false;
            }
        }
        
        return true;

    }
}