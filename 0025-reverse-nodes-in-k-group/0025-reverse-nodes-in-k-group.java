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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode sol = null;
        ListNode solTail = null;

        while (head != null) {
            int count = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            ListNode temp = head;

            while (count < k && temp != null) {
                arr.add(temp.val);
                temp = temp.next;
                ++count;
            }

            if (count < k) {
                if (sol == null) {
                    sol = head;
                } else {
                    solTail.next = head;
                }
                break;
            }

            Collections.reverse(arr);

            for (int i = 0; i < arr.size(); i++) {
                ListNode newNode = new ListNode(arr.get(i));
                if (sol == null) {
                    sol = newNode;
                    solTail = sol;
                } else {
                    solTail.next = newNode;
                    solTail = solTail.next;
                }
            }

            head = temp;
        }

        return sol;
    }
}
