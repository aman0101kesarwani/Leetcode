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
    public ListNode removeNodes(ListNode head) {

        Stack<ListNode> st = new Stack<>();

        ListNode temp = head;

        // O(n)
        while (temp != null) {
            while (!st.isEmpty() && temp.val > st.peek().val) {
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }

        head = null;
        while (!st.isEmpty()) {
            ListNode node = st.pop();
            node.next = head;
            head = node;
        }
        return head;
    }
}