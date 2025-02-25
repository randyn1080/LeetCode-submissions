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
        if (head.next == null && n == 1) {
            head = null;
            return head;
        }
        ListNode lead = head;
        ListNode tail = head;
        ListNode tailTail = head;
        // seperate by n
        for (int i = 0; i < n; i++) {
            lead = lead.next;
        }
        // then iterate both equally until last node
        boolean iterated = false;
        while (lead != null) {
            lead = lead.next;
            tailTail = tail;
            tail = tail.next;
            iterated = true;
        }
        // delete node at n, which is currently at tail
        // if we never entered the second while loop, then we
        // are deleting the first node.
        if (iterated == false) {
            head = head.next;
        } else {
            tailTail.next = tail.next;
            tail.next = null;
        }
        

        return head;
    }
}