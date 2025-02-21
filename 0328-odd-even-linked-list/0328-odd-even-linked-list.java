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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode evenHead = head.next;
        ListNode curr = head;
        ListNode nxt = head.next;
        boolean evenSwitch = true;
        do {
            curr.next = curr.next.next;
            curr = nxt;
            nxt = nxt.next;
            evenSwitch = !evenSwitch;
        } while (nxt.next != null);

        if (evenSwitch) {
            curr.next = evenHead;
            nxt.next = null;
        } else {
            curr.next = null;
            nxt.next = evenHead;
        }

        return head;
    }
}