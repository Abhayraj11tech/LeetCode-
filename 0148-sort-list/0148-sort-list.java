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
    public ListNode sortList(ListNode head) {
      
        if (head == null || head.next == null) {
            return head;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
           Collections.sort(arr);
                if (arr.isEmpty()) {
                    return null;
                }

        ListNode sol = new ListNode(arr.get(0));
        ListNode val = sol;

        for (int i = 1; i < arr.size(); i++) {
            val.next = new ListNode(arr.get(i));
            val = val.next;
        }
        val.next = null;

        return sol;
    }
}