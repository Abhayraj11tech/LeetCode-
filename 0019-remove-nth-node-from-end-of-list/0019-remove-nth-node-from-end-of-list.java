class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        
        while (temp != null) {
            arr.add(temp);
            temp = temp.next;
        }
        
        int idx = arr.size() - n;
        
        if (idx == 0) {
            return head.next;
        }
        
        ListNode sol = arr.get(idx- 1);
        sol.next = sol.next.next;
        
        return head;
    }
}
