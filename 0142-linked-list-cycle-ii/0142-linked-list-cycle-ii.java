public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                ListNode sol = head;
                while (sol != slow) {
                    sol = sol.next;
                    slow = slow.next;
                }
                return sol;
            }
        }
        
        return null;
    }
}
