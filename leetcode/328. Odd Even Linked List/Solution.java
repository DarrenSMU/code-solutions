/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode originalEvenHead = head.next;
        
        while (evenHead != null && evenHead.next != null){
            oddHead.next = evenHead.next;
            oddHead = oddHead.next;
            evenHead.next = oddHead.next;
            evenHead = evenHead.next;
        }
        oddHead.next = originalEvenHead;
        
        return head;
        
        
    }
}