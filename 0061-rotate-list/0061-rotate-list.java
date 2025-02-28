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
    public ListNode rotateRight(ListNode head, int k) {
        // create a loop and find the length
        if (head == null) {
            return head;
        }
        ListNode iter = head;
        ListNode tail = head;
        int length = 0;
        while (iter != null) {
            tail = iter;
            length++;
            iter = iter.next;
        }
        // create loop
        tail.next = head;

        // rotate head and tail k times
        int rotations = length - (k%length);
        for (int i = 0; i < rotations; i++) {
            head = head.next;
            tail = tail.next;
        }

        // severe loop
        tail.next = null;
        return head;
    }
}