import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode[] dt = lists;
        ArrayList<ListNode> arr = new ArrayList<>();
        
        for (ListNode list : dt) {
            ListNode curr = list;
            while (curr != null) {
                arr.add(curr);
                curr = curr.next;
            }
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
