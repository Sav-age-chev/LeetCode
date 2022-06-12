//My initial solution
class Solution {
    public int romanToInt(String s) {
        int sum = 0, curr = 0, prev = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);             
            switch (c) {
                case 'M':
                    curr = 1000;
                    break;
                case 'D':
                    curr = 500;
                    break;
                case 'C':
                    curr = 100;
                    break;
                case 'L':
                    curr = 50;
                    break;
                case 'X':
                    curr = 10;
                    break;
                case 'V':
                    curr = 5;
                    break;
                case 'I':
                    curr = 1;
                    break;
                default:
                    System.out.println("Unexpected character!");
            }
            if (curr <= prev) {
                sum += curr;
                prev = curr;
            } else {
                sum = sum + curr - (2*prev);
                prev = curr;
            }
        }
        return sum;
    }
}