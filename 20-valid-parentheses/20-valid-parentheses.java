/* My initial solution (Time Complexity: O(n), Space Compleity: O(1)) */
class Solution {
    public boolean isValid(String s) {
        
        // Initialising a stack and Character variable to be used
        Stack<Character> parStack = new Stack<Character>();
        char tempChar;
        
        // Looping through the characterrs of the string
        for (int i=0; i<s.length(); i++) {
            
            // Assigning value to the char
            tempChar = s.charAt(i);
            
            //Add char to the stack as a default. Pop the top of the stack in case of coresponding value of thre parentheses or return false if that's not the case 
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
        
        // Return true if the stack is empty or false if not
        if (parStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}


// /* LeetCode optimised solution (Time Complexity: O(n), Space Compleity: O(1)) */
// class Solution {
    
//     // Hash table that takes care of the mappings
//     private HashMap<Character, Character> mappings;
    
//     // Initialise hash map with mapping. This siply maks the code easier to read
//     public Solution() {
//         this.mappings = new HashMap<Character, Character>();
//         this.mappings.put(')','(');
//         this.mappings.put('}','{');
//         this.mappings.put(']','[');
//     }
    
//     public boolean isValid(String s) {
        
//         // Initialise a stack to be used in the algorith
//         Stack<Character> stack = new Stack<Character>();
        
//         for (int i=0; i<s.length(); i++) {
//             char c = s.charAt(i);
            
//             // If the current character is a closing bracket
//             if (this.mappings.containsKey(c)) {
                
//                 // Get the top element of the stack. If the stack is empty, set dummy value of '#'
//                 char topElement = stack.empty() ? '#' : stack.pop();
                
//                 // If the mapping for this bracket doesn't match the stack's top element, return false
//                 if (topElement != this.mappings.get(c)) {
//                     return false;
//                 }
//             } else {
//                 // If it was an opening bracket, push to the stack
//                 stack.push(c);
//             }
//         }
        
//         // If the stack still contains elements, then it is an invalid expression
//         return stack.isEmpty();
//     }
// }
