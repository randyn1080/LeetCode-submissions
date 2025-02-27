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
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }

        ListNode head = lists[0];

        for (int i = 1; i < lists.length; i++) {
            head = mergeTwoLists(head, lists[i]);
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode newHead; 
        ListNode list1Iter = list1;
        ListNode list2Iter = list2;

        if (list1Iter.val <= list2Iter.val) {
            newHead = list1Iter;
            list1Iter = list1Iter.next;
        } else {
            newHead = list2Iter;
            list2Iter = list2Iter.next;
        }
        ListNode newHeadIter = newHead;
        // our new head is determined and stored at newHead
        // and the iterators are in place depending on which
        // one is head (first loop is taken care of)

        while (list1Iter != null && 
               list2Iter != null) {
            if (list1Iter.val <= list2Iter.val) {
                newHeadIter.next = list1Iter;
                newHeadIter = newHeadIter.next;
                list1Iter = list1Iter.next;
            } else {
                newHeadIter.next = list2Iter;
                newHeadIter = newHeadIter.next;
                list2Iter = list2Iter.next;
            }
        }
        if (list1Iter != null) {
            while (list1Iter != null) {
                newHeadIter.next = list1Iter;
                newHeadIter = newHeadIter.next;
                list1Iter = list1Iter.next;
            }
        } else if (list2Iter != null) {
            while (list2Iter != null) {
                newHeadIter.next = list2Iter;
                newHeadIter = newHeadIter.next;
                list2Iter = list2Iter.next;
            }
        }

        return newHead;
    }
}