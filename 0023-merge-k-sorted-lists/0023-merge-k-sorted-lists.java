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
    public ListNode mergeKLists(ListNode[] lists) {
        int size=0;
        for(ListNode l: lists){
            while(l!=null){
                size++;
                l=l.next;
            }
        }
        int[] arr=new int[size];
        int index=0;
        for(ListNode l: lists){
            while(l!=null){
                arr[index]=l.val;
                index++;
                l=l.next;
            }
        }
        Arrays.sort(arr);
        ListNode head=new ListNode();
        ListNode curr=head;
        for(int i=0;i<size; i++){
            curr.next=new ListNode(arr[i]);
            curr=curr.next;
        }
        return head.next;
    }
}