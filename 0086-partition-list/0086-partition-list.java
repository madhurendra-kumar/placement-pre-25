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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode lessHead=new ListNode(0);
        ListNode greaterHead=new ListNode(0);
        ListNode lessTail=lessHead;
        ListNode greaterTail=greaterHead;
        ListNode thead=head;
        while(thead!=null){
            if(thead.val<x){
                lessTail.next=thead;
                lessTail=lessTail.next;
            }else{
                greaterTail.next=thead;
                greaterTail=greaterTail.next;
            }
            thead=thead.next;
        }
        greaterTail.next=null;
        lessTail.next=greaterHead.next;
        return lessHead.next;
        
    }
}