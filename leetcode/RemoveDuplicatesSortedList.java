/*
    Given a sorted linked list,
    delete all duplicates such that each element appear only once.

    Example 1:
    Input: 1->1->2
    Output: 1->2
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode headCopy = head;
        
        while(head!=null && head.next != null) {
            if(head.val == head.next.val)
                head.next = head.next.next;
            else
                head = head.next;
        }
        
        return headCopy;
    }
}