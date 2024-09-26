class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            ++len;
            temp = temp.next;
        }

        int[] sol = new int[len];
        int p = 0;

        while (head != null) {
            ListNode dt = head;
            int val = 0;
            boolean found = false;
            
            while (dt != null) {
                if (dt.val > head.val) {
                    val = dt.val;
                    found = true;
                    break;
                }
                dt = dt.next;
            }
            
            if (!found) {
                val = 0;
            }
            
            sol[p++] = val;
            head = head.next;
        }

        return sol;
    }
}
