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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode iter = head;
        while (iter != null && iter.next != null) {
            if (iter.val == iter.next.val) {
                // remove node
                iter.next = iter.next.next;
            } else {
                iter = iter.next;
            }
        }
        return head;
    }
}