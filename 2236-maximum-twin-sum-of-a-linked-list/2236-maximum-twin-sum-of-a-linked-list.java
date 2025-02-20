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
    public int pairSum(ListNode head) {
        // push onto a stack until we reach the middle el
        Stack<Integer> firstHalf = new Stack();
        
        ListNode tort = head;
        ListNode hare = head;
        while (hare != null && hare.next != null) {
            firstHalf.push(tort.val);
            tort = tort.next;
            hare = hare.next.next;
        }
        // then for each node on the right side of the middle (tort is starting there)
        // pop stack, add to val at node, store if it's max the max
        int maxVal = 0;
        while (tort != null && !firstHalf.isEmpty()) {
            int tempInt = firstHalf.pop();
            maxVal = Math.max(maxVal, tempInt + tort.val);
            tort = tort.next;
        }
        // return the stored maxVal
        return maxVal;
    }
}