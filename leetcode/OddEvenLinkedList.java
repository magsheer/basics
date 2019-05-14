/*
    Given a singly linked list, group all odd nodes together followed by the even nodes.
    Please note here we are talking about the node number and not the value in the nodes.

    Should be done in place. The program should run in O(1) space complexity and
    O(nodes) time complexity.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return head;
        
        // maintain last seen even node     
        ListNode lastSeenEven = head; //0 is even
        ListNode prev = head;
        ListNode headCopy = head;
        head = head.next;
        
        int count = 1;
          
        while(head!=null) {
            if(count % 2 == 0) {
                ListNode temp = head;
                
                //disconnect head
                prev.next = temp.next;
                prev = head;
                
                //keep track of the next node
                head = head.next;
                
                //insert after lastseen
                temp.next = lastSeenEven.next;
                lastSeenEven.next = temp;
                
                //this becomes the new last seen even
                lastSeenEven = temp;               
                
            }
            else {
                prev = head;
                head = head.next;
            }
            count++;
        }
        
        return headCopy;
    }
}