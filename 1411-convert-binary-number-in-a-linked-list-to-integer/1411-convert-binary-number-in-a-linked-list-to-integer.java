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
    public int getDecimalValue(ListNode head) {
        String sol = "";
        while(head!=null){
            int val = head.val;
            sol += Integer.toString(val);
            head = head.next;
        }
        return Integer.parseInt(sol,2);
    }
}