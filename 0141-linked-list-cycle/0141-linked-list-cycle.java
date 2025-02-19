/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode iterNode = head;
        while (iterNode != null) {
            if (nodeSet.contains(iterNode)){
                return true;
            }
            nodeSet.add(iterNode);
            iterNode = iterNode.next;
        }
        return false;
    }
}