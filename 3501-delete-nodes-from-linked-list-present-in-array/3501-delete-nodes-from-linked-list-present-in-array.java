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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> chk = new HashSet<>();
        for (int num : nums) {
            chk.add(num);
        }
        
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            if (!chk.contains(temp.val)) {
                arr.add(temp);
            }
            temp = temp.next;
        }
        
        for (int i = 0; i < arr.size(); i++) {
            if (i < arr.size() - 1) {
                arr.get(i).next = arr.get(i + 1);
            } else {
                arr.get(i).next = null;
            }
        }
        
        return arr.isEmpty() ? null : arr.get(0);
    }
}
