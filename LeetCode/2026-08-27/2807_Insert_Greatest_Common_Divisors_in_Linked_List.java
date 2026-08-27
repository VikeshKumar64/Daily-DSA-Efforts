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
    private int gcd(int a, int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;
        while(current.next != null){
            ListNode nextNode = current.next;
            int cd = gcd(current.val , nextNode.val); 
            current.next = new ListNode(cd);
            current.next.next = nextNode;

            current = nextNode;
        }
        return head;
    }
}