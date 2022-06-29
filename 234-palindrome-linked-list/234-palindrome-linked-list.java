/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/* My initial solution (Time complexity: O(n), Space complexity: O(n)) */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        // Initialising new array list
        List<Integer> newList = new ArrayList<>();
        
        // Filling the array list with values from the linked list
        while (head!=null) {
            newList.add(head.val);
            head = head.next;
        }
        
        // Looping trough the array and camparing coresponding values 
        for (int i=0; i<newList.size()/2; i++) {
            // Return false if values doesn't match
            if (newList.get(i)!=newList.get(newList.size()-1-i)) {
                return false;
            }
        }
        // Return true if the list is palindrome
        return true;
    }
}

/* LeetCode optimised solution (Time complexity: O(n), Space complexity: O(n)) */
/* Recursive */
// class Solution {

//     private ListNode frontPointer;

//     private boolean recursivelyCheck(ListNode currentNode) {
//         if (currentNode != null) {
//             if (!recursivelyCheck(currentNode.next)) return false;
//             if (currentNode.val != frontPointer.val) return false;
//             frontPointer = frontPointer.next;
//         }
//         return true;
//     }

//     public boolean isPalindrome(ListNode head) {
//         frontPointer = head;
//         return recursivelyCheck(head);
//     }
// }
