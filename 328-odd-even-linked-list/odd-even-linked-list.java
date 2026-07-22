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
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode temp = head;

        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        ListNode move = head.next.next;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        for (int i=2; i<n && move!=null; i++) {

            ListNode next = move.next;   // Save next node
            move.next = null;            // Disconnect current node

            // Case : even
            if (i % 2 == 0) {
                odd.next = move;
                odd = odd.next;
            } 
            // case : odd
            else {
                even.next = move;
                even = even.next;
            }

            move = next;
        }

        odd.next = evenHead;
        even.next = null;

        return head;
    }
}