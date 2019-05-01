/*
    Intersection of Two Linked Lists
    Write a program to find the node at which the intersection of two singly
    linked lists begins.

    TODO: Also implement using a HashSet O(m+n) and two pointers O(m+n)
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class LinkedListsIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        //find the lengths
        
        ListNode copyHeadA = headA;
        ListNode copyHeadB = headB;
        
        int lenA = 0;
        int lenB = 0;
        
        while(headA!=null) {
            lenA++;
            headA = headA.next;
        }
        
        while(headB!=null) {
            lenB++;
            headB = headB.next;
        }
        
        if(lenA > lenB) {
            int n = lenA - lenB;
            while(n!=0) {
                copyHeadA = copyHeadA.next;
                n--;
            }
        }
        
        else {
            int n = lenB - lenA;
            while(n!=0) {
                copyHeadB = copyHeadB.next;
                n--;
            }
        }
        
        while(copyHeadA != null) {
            if(copyHeadA == copyHeadB)
                    return copyHeadA;
             copyHeadA = copyHeadA.next;
             copyHeadB = copyHeadB.next;
        }
        
        return null;
        
        
    }
}