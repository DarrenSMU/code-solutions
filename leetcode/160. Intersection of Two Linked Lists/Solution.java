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
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
        Set listA = new HashSet<ListNode>();
        while (headA != null ){
            listA.add(headA);
            headA = headA.next;
        }
        if (listA.isEmpty()){
            return null;
        }
        while (headB != null ){
            if(listA.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}