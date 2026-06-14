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

// head
//   1-->2-->6-->3-->4-->5-->6-->null
// temp
//     temp t.n

//  head
//    7---->7---->7---->7---->null
//  temp 


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;

        // Remove nodes from the beginning
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) return null;

        ListNode temp = head;

        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}