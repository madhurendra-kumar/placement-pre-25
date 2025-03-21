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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        ListNode  rest=swapPairs(head.next.next);
         ListNode second1=head.next;
        second1.next=head;
        head.next=rest;
        return second1;

        
    }
}