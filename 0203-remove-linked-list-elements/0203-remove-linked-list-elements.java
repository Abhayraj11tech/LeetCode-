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
    public ListNode removeElements(ListNode head, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while (head != null) {
            if (head.val != val) {
                list.add(head.val);
            }
            head = head.next;
        }
        
        if (list.isEmpty()) return null;
        
        ListNode sol = new ListNode(list.get(0));
        ListNode current = sol;
        
        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        
        current.next = null;
        
        return sol;
    }
}