class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        ListNode num = prev;
        ListNode max = num;
        temp = num.next;

        while (temp != null) {
            if (temp.val < max.val) {
                max.next = temp.next;
            } else {
                max = temp;
            }
            temp = temp.next;
        }

        prev = null;
        temp = num;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }
}
