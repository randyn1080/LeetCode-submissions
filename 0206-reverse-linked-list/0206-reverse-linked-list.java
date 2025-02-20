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
    public ListNode reverseList(ListNode head) {
        // recursively
        // base case: if head is null 
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode next = reverseList(head.next);
        head.next.next = head;
        head.next = prev;

        return next;
    }
}