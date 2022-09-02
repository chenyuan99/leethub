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
 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        else if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }
        else if (l2.next == null&& l1.next!=null){
            return mergeTwoLists(l2, l1);
        }
        else if(l1.val <= l2.val){
            ListNode temp1 = l1;
            l1 = l1.next;
            temp1.next = l2;
            return mergeTwoLists(l1, temp1);
        }
        else if(l1.val > l2.val){
            ListNode temp2 = l2;
            ListNode temp1 = l1;
            l1 = l1.next;
            boolean flag = false;
            while(temp2.next!=null){
                if (temp1.val <= temp2.next.val){
                    temp1.next = temp2.next;
                    temp2.next = temp1;
                    flag = true;
                    break;
                }
                temp2 = temp2.next;
            }
            if (!flag){
                temp2.next = temp1;
                temp1.next = null;
                flag = true;
            }
            return mergeTwoLists(l1, l2);
        }
        return null;

    }
}