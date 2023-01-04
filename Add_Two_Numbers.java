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
    public ListNode addTwoNumbers(ListNode LL, ListNode LL2) {
        ListNode l = new ListNode(0);
        ListNode current = l;
        int carry = 0;
        while(LL != null || LL2 != null || carry != 0) {
            int X = (LL != null) ? LL.val : 0;
            int Y = (LL2 != null) ? LL2.val : 0;
            int sum = carry + X + Y;
            carry = sum / 10;
            int newNodeVal = sum % 10;
            current.next = new ListNode(newNodeVal);
            current = current.next;
            if (LL != null) LL = LL.next;
            if (LL2 != null) LL2 = LL2.next;
        }
        l = l.next;

        return l;
    }
}
