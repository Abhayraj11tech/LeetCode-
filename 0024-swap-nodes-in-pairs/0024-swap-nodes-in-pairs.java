class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode newHead = head.next;
        ListNode prev = null;

        while (curr != null && curr.next != null) {
            ListNode tmp = curr.next.next;
            ListNode second = curr.next;

            second.next = curr;
            curr.next = tmp;

            if (prev != null) {
                prev.next = second;
            }

            prev = curr;
            curr = tmp;
        }

        return newHead;
    }
}
