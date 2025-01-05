class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;

        ArrayList<Integer> arr = new ArrayList<>();
        ListNode l = head;
        while (l != null) {
            arr.add(l.val);
            l = l.next;
        }

        k = k % arr.size(); 
        if (k == 0) return head;

        ArrayList<Integer> brr = new ArrayList<>();
        for (int i = arr.size() - k; i < arr.size(); i++) {
            brr.add(arr.get(i));
        }
        for (int i = 0; i < arr.size() - k; i++) {
            brr.add(arr.get(i));
        }

        ListNode sol = new ListNode(brr.get(0));
        ListNode curr = sol;
        for (int i = 1; i < brr.size(); i++) {
            curr.next = new ListNode(brr.get(i));
            curr = curr.next;
        }

        return sol;
    }
}
