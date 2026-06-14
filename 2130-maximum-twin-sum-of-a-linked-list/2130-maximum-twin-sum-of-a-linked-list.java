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
    public int pairSum(ListNode head) {

        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        int e = list.size()-1;
        int s = 0;
        int mid1 = s + (e-s) / 2;
        int mid2 = mid1+1;
        int ans = 0;
        while(s<=mid1 && e>=mid2){
            ans = Math.max(ans, list.get(mid1)+list.get(mid2));
            mid1--;
            mid2++;
            ans = Math.max(ans, list.get(e)+list.get(s));
            s++;
            e--;
        }
        return ans;
    }
}