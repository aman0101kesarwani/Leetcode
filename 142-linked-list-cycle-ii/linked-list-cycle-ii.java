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
    public ListNode detectCycle(ListNode head) {
        // M1: using map
        HashMap<ListNode, Integer> map = new HashMap<>();

        if(head == null || head.next==null) return null;

        ListNode temp = head;
        int idx = 0;

        while(temp!=null){
            if(map.containsKey(temp)){
                return temp;
            }

            map.put(temp, idx);
            temp=temp.next;
        }

        return null;
    }
}