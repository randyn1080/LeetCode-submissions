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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // edge case 1 node;
        if (head.next == null && n == 1) {
            head = null;
            return head;
        }
        ListNode lead = head;
        ListNode tail = head;
        ListNode tailTail = head;
        // seperate lead from tail by n
        for (int i = 0; i < n; i++) {
            lead = lead.next;
        }
        // if lead is null before the loop, we are deleting
        // the first node.
        if (lead == null) {
            head = head.next;
            return head;
        }
        // else, position tail and tailTail at appropriate
        // nodes
        while (lead != null) {
            lead = lead.next;
            tailTail = tail;
            tail = tail.next;
        }
        // delete node at n 
        tailTail.next = tail.next;
        tail.next = null;
        
        return head;
    }
}