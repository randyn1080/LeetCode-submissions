/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode iter = node;
        ListNode prev = iter;
        while (iter.next != null) {
            prev = iter;
            iter.val = iter.next.val;
            iter = iter.next;
        }
        prev.next = null;
    }
}