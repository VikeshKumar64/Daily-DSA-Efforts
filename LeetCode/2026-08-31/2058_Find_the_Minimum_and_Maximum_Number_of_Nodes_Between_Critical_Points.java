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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        ListNode current = head;
        int first = 0;
        int i = 0;
        int j = 0;
        int count = 1;
        while(current.next != null && current.next.next != null){
            if ((current.next.val > current.val && current.next.val > current.next.next.val) ||(current.next.val < current.val &&current.next.val < current.next.next.val)) {
                if(first == 0){
                    first = count;
                    i = count;
                }
                else{
                    j = count;
                    int distance = j - i;

                    if (ans[0] == -1 || distance < ans[0]){
                        ans[0] = distance; 
                    }
                    i = j;
                }
            }
            
            current = current.next;
            count++;
        }
        if (i != first){ 
            ans[1] = i - first; 
        }
        return ans;
    }
}