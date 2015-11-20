/*** Reverse a singly linked list.***/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 public Solution{
   public ListNode ReverseList(ListNode head){
     ListNode pre = null;
     while(head != null){
       ListNode temp = head.next;
       head.next = pre;
       pre = head;
       head = temp;
     }
     
     return pre;
   }
 }
