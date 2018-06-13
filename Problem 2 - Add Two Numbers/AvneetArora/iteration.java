/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1,q = l2, current = head;
        int carry = 0, sum = 0;
        while (p != null || q != null){
            sum = 0;
            int a = (p == null? 0: p.val);
            int b = (q==null? 0:q.val);

            sum = a + b + carry;
            carry = sum/10;
            sum = sum%10;
            
            current.next = new ListNode(sum);
            current = current.next;
            if (p!=null){
                p=p.next;
            }
            if (q!= null){
                q=q.next;
            }
        }
        
        if (carry != 0){
            current.next = new ListNode(carry);
        }
        return head.next;
    }
}