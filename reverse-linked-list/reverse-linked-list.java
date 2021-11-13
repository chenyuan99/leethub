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
    public ListNode reverseList(ListNode head) {
                ListNode lol = new ListNode();
        if (head == null|| head.next == null){
            return head;
        }
        ListNode temp;
        ListNode newTail = new ListNode(head.val, null);
        ListNode newHead = newTail;
        temp = head;
        while(temp.next !=  null){
            temp = temp.next;
            ListNode newTemp = new ListNode();
            newTemp.val = temp.val;
            newTemp.next = newHead;
            newHead = newTemp;
        }

        return newHead;
        
    }
}