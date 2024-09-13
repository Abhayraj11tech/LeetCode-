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
        Stack<ListNode> stack = new Stack();
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null) {
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }
        int max = 0;
        while(slow != null) {
            max = Integer.max(max, slow.val + stack.pop().val);
            slow = slow.next;
        }
        return max;
    }
}

