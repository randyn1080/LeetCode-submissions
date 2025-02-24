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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Iter = l1;
        ListNode l2Iter = l2;        
        ListNode head = new ListNode();
        ListNode retHead = head;
        int remainder = 0;
        while (l1Iter != null && l2Iter != null) {
            int sum = l1Iter.val + l2Iter.val + remainder;
            if (sum >= 10) {
                head.next = new ListNode(sum%10);
                remainder = 1;
            } else {
                head.next = new ListNode(sum);
                remainder = 0;
            }
            head = head.next;
            l1Iter = l1Iter.next;
            l2Iter = l2Iter.next;
        }

        // check for remaining length of lists
        if (l1Iter != null) {
            // more in l1Iter
            while (l1Iter != null) {
                int sum = l1Iter.val + remainder;
                if (sum >= 10) {
                    head.next = new ListNode(sum%10);
                    remainder = 1;
                } else {
                    head.next = new ListNode(sum);
                    remainder = 0;
                }
                head = head.next;
                l1Iter = l1Iter.next;
            }
        } else if (l2Iter != null) {
            // more in l2Iter
            while (l2Iter != null) {
                int sum = l2Iter.val + remainder;
                if (sum >= 10) {
                    head.next = new ListNode(sum%10);
                    remainder = 1;
                } else {
                    head.next = new ListNode(sum);
                    remainder = 0;
                }
                head = head.next;
                l2Iter = l2Iter.next;
            }
        }
        if (remainder == 1) {
            head.next = new ListNode(1);
        }

        retHead = retHead.next;
        return retHead;
    }
}