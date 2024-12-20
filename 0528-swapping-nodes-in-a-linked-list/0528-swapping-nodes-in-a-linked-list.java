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
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        
        while (temp != null) {
            arr.add(temp);
            temp = temp.next;
        }
        
        ListNode elm = arr.get(k - 1);
        ListNode val = arr.get(arr.size() - k);
        
        int tempVal = elm.val;
        elm.val = val.val;
        val.val = tempVal;
        
        for (int i = 0; i < arr.size() - 1; i++) {
            arr.get(i).next = arr.get(i + 1);
        }
        
        arr.get(arr.size() - 1).next = null;
        
        return arr.get(0);
    }
}






