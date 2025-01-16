/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        
        ListNode current = head;
        while (current != null) {
            boolean flag = false;
            for (ListNode node : list) {
                if (node.val == current.val) {
                   flag = true;
                    break;
                }
            }
            if (!flag) {
                list.add(current);
            }
            current = current.next;
        }

 Collections.sort(list, (a, b) -> Integer.compare(a.val, b.val));
        if (list.isEmpty()) return null;

        ListNode sol = list.get(0);
        ListNode val = sol;
        for (int i = 1; i < list.size(); i++) {
            val.next = list.get(i);
            val = val.next;
        }
        val.next = null;

        return sol;
    }
}
