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
        ListNode dummyHead = new ListNode(0, head);
        ListNode iter = dummyHead.next;
        ListNode nonDupeHead = dummyHead;
        
        while (iter != null && iter.next != null) {
            if (iter.val == iter.next.val) {
                // remove all nodes
                while (iter.next != null && iter.val == iter.next.val) {
                    iter.next = iter.next.next;
                }
                // now we need to delete the current iter, which
                // had others equal to it.
                iter = iter.next;
                nonDupeHead.next = iter;
            } else {
                nonDupeHead = iter;
                iter = iter.next;
            }
        }
        return dummyHead.next;
    }
}