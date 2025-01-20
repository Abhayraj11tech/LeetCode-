class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        arr.remove(arr.size() - n);

        ListNode newHead = null;
        ListNode current = null;

        for (int val : arr) {
            ListNode newNode = new ListNode(val);
            if (newHead == null) {
                newHead = newNode;
            } else {
                current.next = newNode;
            }
            current = newNode;
        }

        return newHead;
    }
}
