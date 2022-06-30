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
/* Recursion */
class Solution {    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // Instantiating new node
        ListNode mergedList = new ListNode();
        
        // Adding the lowest value from the given linked lists to the new node and moving head to the next node
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val<=list2.val) {
            mergedList.val = list1.val;
            list1 = list1.next;
        } else if (list1.val>list2.val) {
            mergedList.val = list2.val;
            list2 = list2.next;
        }
        
        // If either of the list have more nodes recursively call the method
        if (list1!=null || list2!=null) {
            mergedList.next = mergeTwoLists(list1, list2);
        }
        
        // Return the node
        return mergedList;
    }
}

/* LeetCode optimised solution (Time complexity: O(n), Space complexity: O(n)) */
/* Recursion */
// class Solution {
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         if (l1 == null) {
//             return l2;
//         }
//         else if (l2 == null) {
//             return l1;
//         }
//         else if (l1.val < l2.val) {
//             l1.next = mergeTwoLists(l1.next, l2);
//             return l1;
//         }
//         else {
//             l2.next = mergeTwoLists(l1, l2.next);
//             return l2;
//         }

//     }
// }

/* LeetCode optimised solution (Time complexity: O(n), Space complexity: O(1)) */
/* Iteration */
// class Solution {
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         // maintain an unchanging reference to node ahead of the return node.
//         ListNode prehead = new ListNode(-1);

//         ListNode prev = prehead;
//         while (l1 != null && l2 != null) {
//             if (l1.val <= l2.val) {
//                 prev.next = l1;
//                 l1 = l1.next;
//             } else {
//                 prev.next = l2;
//                 l2 = l2.next;
//             }
//             prev = prev.next;
//         }

//         // At least one of l1 and l2 can still have nodes at this point, so connect
//         // the non-null list to the end of the merged list.
//         prev.next = l1 == null ? l2 : l1;

//         return prehead.next;
//     }
// }
