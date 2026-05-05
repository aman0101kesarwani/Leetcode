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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        
        if (temp == null) return temp;

        // Step 1: find length
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Step 2: if deleting head
        if (len == n) {
            return head.next;
        }

        // Step 3: go to node before target
        temp = head;
        int size = 0;

        while (temp != null) {
            if (size == len - n - 1){
                temp.next = temp.next.next; 
                break;
            }
            temp = temp.next;
            size++;
        }

        return head;
    }
}