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
        return addTwoNumbers(l1, l2, 0);
    }
    
    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry){
        if (l1 == null && l2 == null &&   carry == 0){
            return null;
        }
        
        int sum = 0;
        if (l1 != null){
            sum+=l1.val;
        }
        if (l2 != null){
            sum +=l2.val;
        }
        sum+=carry;
        carry = sum/10;
        sum= sum%10;
        
        ListNode l = new ListNode(sum);
        l.next = addTwoNumbers((l1 == null? null: l1.next), (l2==null?null:l2.next),carry);
        return l;
    }
}