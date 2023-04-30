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
      public static ListNode reverse(ListNode head){
       if(head.next==null||head==null) return head;
  ListNode newHead=reverse(head.next);
  head.next.next=head;
  head.next=null;
  return newHead;
    }
 public ListNode addTwoNumbers(ListNode first, ListNode second) {
        ListNode l1=reverse(first);
        ListNode l2=reverse(second);
        ListNode dummy=new ListNode(0);
        int carry=0;
        ListNode temp=dummy;
        while (l1!=null||l2!=null||carry==1){
            int sum=0;
            if(l1!=null){
                sum=sum+ l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+ l2.val;
                l2=l2.next;
            }
            sum=sum+carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        ListNode ans=reverse(dummy.next);
        return ans;
    }
}