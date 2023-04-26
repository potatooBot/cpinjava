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
    public void reorderList(ListNode head) {
        if(head==null) return;

        Stack<ListNode> stk=new Stack<>();
        ListNode cur=new ListNode();
        cur=head;
        ListNode slow=head;
        ListNode fast=head;

        while (fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=slow.next;
   while (slow!=null){
       stk.push(slow);
       slow=slow.next;
   }
   while (stk.isEmpty()==false){
       ListNode node=stk.peek();
       node.next=cur.next;
       cur.next=node;
       cur=cur.next.next;
       stk.pop();
   }
   cur.next=null;
   ListNode cur2=head;
   while (cur2!=null){
       System.out.println(cur2.val);
       cur2=cur2.next;
   }
    }
}