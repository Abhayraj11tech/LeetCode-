class Solution {
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            arr.add(node.val);
            node = node.next;
        }
        ArrayList<Integer> sol = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < x) {
                sol.add(arr.get(i));
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)>=x) {
                sol.add(arr.get(i));
            }
        }
        ListNode val = new ListNode(0);
        ListNode res = val;
        for (int v : sol) {
            res.next = new ListNode(v);
            res = res.next;
        }
        return val.next;
    }
}
