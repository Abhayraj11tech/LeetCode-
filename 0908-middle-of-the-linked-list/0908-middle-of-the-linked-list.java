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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode cmp = head;

        while (head != null) {
            ++count;
            head = head.next;
        }
        
        int mid = (count/2)+1;
        int val = 1;
        
        while (val < mid) {
            cmp = cmp.next;
            ++val;
        }
        
        return cmp; 
    }
}

