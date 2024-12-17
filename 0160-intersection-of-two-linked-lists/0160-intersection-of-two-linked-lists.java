/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode sol = null;

        int lenA = 0, lenB = 0;
        ListNode currA = headA, currB = headB;

        while (currA != null) {
            lenA++;
            currA = currA.next;
        }

        while (currB != null) {
            lenB++;
            currB = currB.next;
        }

        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        while (headA != null && headB != null) {
            if (headA == headB) { 
                sol = headA;
                break;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return sol;
    }
}
