class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ArrayList<ListNode> even = new ArrayList<>();
        ArrayList<ListNode> odd = new ArrayList<>();

        ListNode temp = head;
        int index = 1;
        while (temp != null) {
            if (index % 2 == 0) {
                even.add(temp);
            } else {
                odd.add(temp);
            }
            temp = temp.next;
            index++;
        }

        ListNode sol = odd.get(0); 
        temp = sol;

        for (int i = 1; i < odd.size(); i++) {
            temp.next = odd.get(i);
            temp = temp.next;
        }

        for (int i = 0; i < even.size(); i++) {
            temp.next = even.get(i);
            temp = temp.next;
        }

        temp.next = null; 
        return sol;
    }
}
