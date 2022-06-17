//My initial solution
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> parStack = new Stack<Character>();
        char tempChar;
        
        for (int i=0; i<s.length(); i++) {
            
            tempChar = s.charAt(i);
            
            switch (tempChar) {
                case ')':
                    tempChar--;
                    if (parStack.isEmpty() || tempChar!=parStack.peek()) {
                        return false;
                    } else {
                        parStack.pop();
                    }
                    break;
                case ']':
                    tempChar-=2;
                    if (parStack.isEmpty() || tempChar!=parStack.peek()) {
                        return false;
                    } else {
                        parStack.pop();
                    }
                    break;
                case '}':
                    tempChar-=2;
                    if (parStack.isEmpty() || tempChar!=parStack.peek()) {
                        return false;
                    } else {
                        parStack.pop();
                    }
                    break;
                default:
                    parStack.push(tempChar);
            }
        }
        if (parStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}