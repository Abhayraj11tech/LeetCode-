class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        ListNode curr = head;
        int p = 0, q = arr.size() - 1;

        while (p <= q) {
            if (p == q) {
                curr.val = arr.get(p); 
                break; 
            } else {
                curr.val = arr.get(p++); 
                curr = curr.next; 
                curr.val = arr.get(q--); 
                curr = curr.next; 
            }
        }
    }
}
