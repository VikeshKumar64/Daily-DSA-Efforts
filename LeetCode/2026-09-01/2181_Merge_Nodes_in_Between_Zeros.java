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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode curr = head.next;
        ListNode store = head;
        while(curr != null){
            if(curr.val == 0){
                store = store.next;
                store.val = sum;
                sum = 0;
            }else{
                sum += curr.val;
            }
            curr = curr.next;
        }
        store.next = null;
        return head.next;
    }
}