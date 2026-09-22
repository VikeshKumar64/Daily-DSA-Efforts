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
    ListNode getKthNode(ListNode temp, int k){
        k -= 1;
        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
    ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode temp = head;

        while(temp != null){
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;;
            temp = nextNode;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;

        while(temp != null){
            ListNode kThNode = getKthNode(temp, k);

            if(kThNode == null){
                if(prevLast != null){
                    prevLast.next = temp;
                }
                break;
            }

            ListNode nextNode = kThNode.next;
            kThNode.next = null;

            ListNode newHead = reverseLinkedList(temp);

            if(temp == head){
                head = newHead;
            }else{
                prevLast.next = newHead;
            }

            prevLast = temp;

            temp = nextNode;
        }
        return head;
    }
}