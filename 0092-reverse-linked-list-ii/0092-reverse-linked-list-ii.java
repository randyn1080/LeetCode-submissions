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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // NOTE: left and right position can define the bounds of our 
        //       list because of constraint 3: 1 <= left <= right <= n

        // use a dummyhead to enable null catch and first node flippage
        ListNode dummyHead = new ListNode(0, head);
        if (dummyHead.next == null || head.next == null) {
            return head;
        }

        // get to first position
        ListNode setLeftNode = dummyHead.next;
        ListNode headConnectionNode = dummyHead; // functions as prev to left
        for (int i = 0; i < left-1; i++) {
            headConnectionNode = setLeftNode;
            setLeftNode = setLeftNode.next;
        }
        // reverse for x nodes, x = right - left;
        ListNode futureTail = setLeftNode;

        int reverseOperations = right - left;
        ListNode prev = null;
        ListNode curr = setLeftNode;
        for (int i = 0; i <= reverseOperations; i++) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        
        // reconnect to saved endpoints from original list
        headConnectionNode.next = prev;
        futureTail.next = curr;
        // return dummyhead.next;
        return dummyHead.next;
    }
}