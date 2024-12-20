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
    public ListNode deleteMiddle(ListNode head) {
         if (head == null || head.next == null) {
            return null;
        }

        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            ++len;
            temp = temp.next;
        }

        int idx = len / 2;

        ListNode prev = null;
        temp = head;
        int p = 0;
        
        while (temp != null) {
            if (p == idx) {
                if (prev != null) {
                    prev.next = temp.next;
                }
                break;
            }
            prev = temp;
            temp = temp.next;
            ++p;
        }

        return head;
    }
}
