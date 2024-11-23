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
        
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            arr.add(curr);
            curr = curr.next;
        }
           Collections.sort(arr, new Comparator<ListNode>() {
            public int compare(ListNode a, ListNode b) {
                return Integer.compare(a.val, b.val);
            }
        });
                if (arr.isEmpty()) return null;

        ListNode sol = arr.get(0);
        ListNode val = sol;

        for (int i = 1; i < arr.size(); i++) {
            val.next = arr.get(i);
            val = val.next;
        }
        val.next = null;

        return sol;
    }
}