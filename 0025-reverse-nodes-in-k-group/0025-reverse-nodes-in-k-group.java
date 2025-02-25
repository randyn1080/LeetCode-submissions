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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode iter = dummyHead;
        while (iter != null) {
            List<ListNode> tempList = reverseLl(iter.next, k);
            // head in tempList[0]
            iter.next = tempList.get(0);
            // tail in tempList[1]
            iter = tempList.get(1);
        }
        return dummyHead.next;
    }

    public List<ListNode> reverseLl(ListNode head, int length) {
        
        // return list      
        List<ListNode> tempList = new ArrayList<>();

        // if we dont go x distance,
        // return tempList[0] = head and tempList[1] = null;
        // this will cause the calling loop to break;
        ListNode lengthCheck = head;
        for (int i = 0; i < length; i++) {
            if (lengthCheck == null) {
                tempList.add(head);
                tempList.add(null);
                return tempList;
            }
            lengthCheck = lengthCheck.next;
        }
        
        // 0 will hold new head, 1 will hold new tail
        ListNode prev = null;
        ListNode curr = head;
        
        ListNode tempTail = curr;
        ListNode tempHead = head;
        for (int i = 0; i < length; i++) {
            ListNode nxt = curr.next;
            // reverse
            curr.next = prev;
            prev = curr;
            curr = nxt;

            if (i == length-1) {
                // last loop
                tempHead = prev;
                tempTail.next = nxt;
            } 
        }
        // set head
        tempList.add(tempHead);
        // set tail
        tempList.add(tempTail);
        return tempList;
    }
}