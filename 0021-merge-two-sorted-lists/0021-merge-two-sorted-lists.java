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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<ListNode> list = new ArrayList<>();
        
        ListNode current = list1;
        while (current != null) {
            list.add(current);
            current = current.next;
        }

        ListNode current2 = list2;
        while (current2 != null) {
            list.add(current2);
            current2 = current2.next;
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
