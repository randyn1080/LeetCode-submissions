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
    public ListNode swapPairs(ListNode head) {
        // use this to attach the first reversal on
        ListNode dummyHead = new ListNode(0, head);
        ListNode iter = dummyHead;
        // reverse first pair
        while ( iter != null      &&
                iter.next != null && 
                iter.next.next != null
                ) {
            iter.next = reversePair(iter.next);
            iter = iter.next.next;
        }
        
        return dummyHead.next;
    }
    public ListNode reversePair(ListNode head) {
        // reverse nodes from head to tail
        // reconnect tail in this method******
        ListNode prev = head;
        ListNode curr = prev.next;
        ListNode nxt = curr.next;
        
        curr.next = prev;
        prev.next = nxt;

        ListNode newHead = curr;
        
        return newHead;

        // return a list of ListNodes, head then tail
    }
}