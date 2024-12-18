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
    public boolean isPalindrome(ListNode head) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while (head != null) {
            list1.add(head.val);
            list2.add(head.val);
            head = head.next;
        }
        Collections.reverse(list1);
        if(list1.equals(list2)){
            return true;
        }
        else{
            return false;
        }
      }
}