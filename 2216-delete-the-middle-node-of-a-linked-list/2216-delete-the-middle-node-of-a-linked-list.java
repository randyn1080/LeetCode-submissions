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
    public ListNode deleteMiddle(ListNode head) {
        // 3 pointers
        // a tortoise and a hare to find the middle
        // and a baby tortoise trailing the tort to 
        // find the one previous so we can link them

        if (head.next == null){
            head = null;
            return head;
        }
            
        ListNode babyTort = null;;
        ListNode tort = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            babyTort = tort;
            tort = tort.next;
            hare = hare.next.next;
        }

        babyTort.next = tort.next;
        tort.next = null;

        return head;
    }
}