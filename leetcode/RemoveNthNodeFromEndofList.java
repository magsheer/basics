/*
    Remove Nth Node From End of List

    Given a linked list, remove the n-th node from the end of list
    return its head.

    Interesting solution - Maintain two pointers, move one such that
    first - second = n, then move second pointer until the end of list.
    first pointer - desired node.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode headCopy = head;
        int nodeCount = 0;
        
        while(headCopy!=null) {
            nodeCount++;
            headCopy = headCopy.next;
        }
        
        n = nodeCount - n;
        nodeCount = 0;
        
        //head
        if(n == 0) {    
            return head.next;
        }
        
        ListNode prev = head;
        headCopy = head;
        
        while(nodeCount!=n) {
            prev = headCopy;
            headCopy = headCopy.next;
            nodeCount++;
        }
        
        // System.out.println(headCopy.val);
        
        prev.next = headCopy.next;
        headCopy.next = null;
        
        return head;
        
    }
}