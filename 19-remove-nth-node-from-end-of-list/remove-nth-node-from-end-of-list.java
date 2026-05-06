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


//  dummy--->1--->2--->3--->4--->5--->6--->7 : target = 5 , as n=3,: using gap instead of length : problem done in one phase 
//           0    1    2    3    4    5    6
//           i
//   slow                 fast
//                        slow            fast  

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // creating dummy/psedo/sentinel head for edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow=dummy, fast=dummy;

        // moving fast to the node before target
        for(int i=0; i<=n; i++){
            fast=fast.next;
        }

        // move both pointer together : (we are making the distance b/w them = n)
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        // remove node
        slow.next = slow.next.next;

        return dummy.next;   // edge case covered
    }
}