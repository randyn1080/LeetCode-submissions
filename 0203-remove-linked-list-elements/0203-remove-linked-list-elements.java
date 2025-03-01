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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // make a dummy head
        if (head == null) return null;
        ListNode dummyHead = new ListNode(0, head);
        // go through the list and remove any listnodes that are equal to val
        ListNode iter = dummyHead.next;
        ListNode prev = dummyHead;
        while (iter != null) {
            if (iter.val == val) {
                prev.next = iter.next;
                iter = iter.next;
            } else {
                prev = iter;
                iter = iter.next;
            }
            
        }
        
        return dummyHead.next;
    }
}