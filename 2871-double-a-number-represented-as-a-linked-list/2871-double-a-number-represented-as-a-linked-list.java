import java.math.BigInteger;

class Solution {
    public ListNode doubleIt(ListNode head) {
        StringBuilder sol = new StringBuilder();
        while (head != null) {
            sol.append(head.val);
            head = head.next;
        }

        BigInteger number = new BigInteger(sol.toString());
        number = number.multiply(BigInteger.valueOf(2));
        String res = number.toString();
        
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        
        for (char c : res.toCharArray()) {
            curr.next = new ListNode(Character.getNumericValue(c));
            curr = curr.next;
        }
        
        return temp.next;
    }
}
